package io.swagger.codegen.languages;

import com.google.common.collect.ImmutableMap;
import com.samskivert.mustache.Mustache;

import io.swagger.codegen.CliOption;
import io.swagger.codegen.CodegenModel;
import io.swagger.codegen.CodegenProperty;
import io.swagger.codegen.SupportingFile;
import io.swagger.models.ModelImpl;
import io.swagger.models.properties.*;

import io.swagger.codegen.mustache.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class TypeScriptFetchClientCodegen extends AbstractTypeScriptClientCodegen {
    private static final SimpleDateFormat SNAPSHOT_SUFFIX_FORMAT = new SimpleDateFormat("yyyyMMddHHmm");

    public static final String NPM_NAME = "npmName";
    public static final String NPM_VERSION = "npmVersion";
    public static final String NPM_REPOSITORY = "npmRepository";
    public static final String SNAPSHOT = "snapshot";
    public static final String WITH_INTERFACES = "withInterfaces";
    public static final String API_CONFIG_CLASS_NAME = "apiConfigClassName";

    protected String npmName = null;
    protected String npmVersion = "1.0.0";
    protected String npmRepository = null;
    protected String apiConfigClassName = null;

    public TypeScriptFetchClientCodegen() {
        super();

        // clear import mapping (from default generator) as TS does not use it
        // at the moment
        importMapping.clear();

        outputFolder = "generated-code/typescript-fetch";
        embeddedTemplateDir = templateDir = "typescript-fetch";

        this.cliOptions.add(new CliOption(NPM_NAME, "The name under which you want to publish generated npm package"));
        this.cliOptions.add(new CliOption(NPM_VERSION, "The version of your npm package"));
        this.cliOptions.add(new CliOption(NPM_REPOSITORY, "Use this property to set an url your private npmRepo in the package.json"));
        this.cliOptions.add(new CliOption(SNAPSHOT, "When setting this property to true the version will be suffixed with -SNAPSHOT.yyyyMMddHHmm", BooleanProperty.TYPE).defaultValue(Boolean.FALSE.toString()));
        this.cliOptions.add(new CliOption(WITH_INTERFACES, "Setting this property to true will generate interfaces next to the default class implementations.", BooleanProperty.TYPE).defaultValue(Boolean.FALSE.toString()));
        this.cliOptions.add(new CliOption(API_CONFIG_CLASS_NAME, "Use this property to change the default class name used to configure the API setup parameters from 'Configuration' to a custom name."));
    }

    @Override
    protected void addAdditionPropertiesToCodeGenModel(CodegenModel codegenModel, ModelImpl swaggerModel) {
        codegenModel.additionalPropertiesType = getTypeDeclaration(swaggerModel.getAdditionalProperties());
        addImport(codegenModel, codegenModel.additionalPropertiesType);
    }

    @Override
    public void processOpts() {
        super.processOpts();
        supportingFiles.add(new SupportingFile("index.mustache", "", "index.ts"));
        supportingFiles.add(new SupportingFile("api.mustache", "", "api.ts"));
        supportingFiles.add(new SupportingFile("configuration.mustache", "", "configuration.ts"));
        supportingFiles.add(new SupportingFile("custom.d.mustache", "", "custom.d.ts"));
        supportingFiles.add(new SupportingFile("git_push.sh.mustache", "", "git_push.sh"));
        supportingFiles.add(new SupportingFile("gitignore", "", ".gitignore"));

        if (additionalProperties.containsKey(NPM_NAME)) {
            addNpmPackageGeneration();
        }

        if (additionalProperties.containsKey(API_CONFIG_CLASS_NAME)) {
            setApiConfigClassName(additionalProperties.get(API_CONFIG_CLASS_NAME).toString());
        } else {
            //this.apiConfigClassName = apiConfigClassName; //"Configuration"; //setApiConfigClassName("Configuration");
            //apiConfigClassName = "Configuration";
            //setApiConfigClassName(apiConfigClassName);
            additionalProperties.put(API_CONFIG_CLASS_NAME, "Configuration");
        }

        addMustacheLambdas(additionalProperties);
    }

    @Override
    public String getTypeDeclaration(Property p) {
        Property inner;
        if(p instanceof ArrayProperty) {
            ArrayProperty mp1 = (ArrayProperty)p;
            inner = mp1.getItems();
            return this.getSwaggerType(p) + "<" + this.getTypeDeclaration(inner) + ">";
        } else if(p instanceof MapProperty) {
            MapProperty mp = (MapProperty)p;
            inner = mp.getAdditionalProperties();
            return "{ [key: string]: " + this.getTypeDeclaration(inner) + "; }";
        } else if(p instanceof FileProperty || p instanceof ObjectProperty) {
            return "any";
        } else {
            return super.getTypeDeclaration(p);
        }
    }

    private void addMustacheLambdas(Map<String, Object> objs) {

        Map<String, Mustache.Lambda> lambdas = new ImmutableMap.Builder<String, Mustache.Lambda>()
                .put("lowercase", new LowercaseLambda().generator(this))
                .put("uppercase", new UppercaseLambda())
                .put("titlecase", new TitlecaseLambda())
                .put("camelcase", new CamelCaseLambda().generator(this))
                .put("camelcase_param", new CamelCaseLambda().generator(this).escapeAsParamName(true))
                .put("indented", new IndentedLambda())
                .put("indented_8", new IndentedLambda(8, " "))
                .put("indented_12", new IndentedLambda(12, " "))
                .put("indented_16", new IndentedLambda(16, " "))
                .build();

        if (objs.containsKey("lambda")) {
            LOGGER.warn("An property named 'lambda' already exists. Mustache lambdas renamed from 'lambda' to '_lambda'. " +
                    "You'll likely need to use a custom template, " +
                    "see https://github.com/swagger-api/swagger-codegen#modifying-the-client-library-format. ");
            objs.put("_lambda", lambdas);
        } else {
            objs.put("lambda", lambdas);
        }
    }

    private void addNpmPackageGeneration() {
        if (additionalProperties.containsKey(NPM_NAME)) {
            this.setNpmName(additionalProperties.get(NPM_NAME).toString());
        }

        if (additionalProperties.containsKey(NPM_VERSION)) {
            this.setNpmVersion(additionalProperties.get(NPM_VERSION).toString());
        }

        if (additionalProperties.containsKey(SNAPSHOT) && Boolean.valueOf(additionalProperties.get(SNAPSHOT).toString())) {
            this.setNpmVersion(npmVersion + "-SNAPSHOT." + SNAPSHOT_SUFFIX_FORMAT.format(new Date()));
        }
        additionalProperties.put(NPM_VERSION, npmVersion);

        if (additionalProperties.containsKey(NPM_REPOSITORY)) {
            this.setNpmRepository(additionalProperties.get(NPM_REPOSITORY).toString());
        }

        //Files for building our lib
        supportingFiles.add(new SupportingFile("README.mustache", "", "README.md"));
        supportingFiles.add(new SupportingFile("package.mustache", "", "package.json"));
        supportingFiles.add(new SupportingFile("tsconfig.mustache", "", "tsconfig.json"));
    }

    @Override
    public String getName() {
        return "typescript-fetch";
    }

    @Override
    public String getHelp() {
        return "Generates a TypeScript client library using Fetch API (beta).";
    }

    public String getNpmName() {
        return npmName;
    }

    public void setNpmName(String npmName) {
        this.npmName = npmName;
    }

    public String getNpmVersion() {
        return npmVersion;
    }

    public void setNpmVersion(String npmVersion) {
        this.npmVersion = npmVersion;
    }

    public String getNpmRepository() {
        return npmRepository;
    }

    public void setNpmRepository(String npmRepository) {
        this.npmRepository = npmRepository;
    }

    public String getApiConfigClassName() {
        return apiConfigClassName;
    }

    public void setApiConfigClassName(String apiConfigClassName) {
        this.apiConfigClassName = apiConfigClassName;
    }

}
