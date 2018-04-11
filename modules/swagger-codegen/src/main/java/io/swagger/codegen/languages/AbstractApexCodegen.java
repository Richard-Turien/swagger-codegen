package io.swagger.codegen.languages;

import java.io.File;
import java.util.*;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Strings;

import io.swagger.codegen.*;
import io.swagger.models.Model;
import io.swagger.models.Operation;
import io.swagger.models.Path;
import io.swagger.models.Swagger;
import io.swagger.models.parameters.FormParameter;
import io.swagger.models.parameters.Parameter;
import io.swagger.models.properties.*;


public abstract class AbstractApexCodegen extends DefaultCodegen implements CodegenConfig {

    protected Boolean serializableModel = false;

    public AbstractApexCodegen() {
        super();
    }

    @Override
    public CodegenType getTag() {
        return CodegenType.CLIENT;
    }

    @Override
    public String getName() {
        return "apex";
    }

    @Override
    public String getHelp() {
        return "Generates an Apex API client library (beta).";
    }

    @Override
    public void processOpts() {
        super.processOpts();
    }

    @Override
    public String escapeReservedWord(String name) {
        if(this.reservedWordsMappings().containsKey(name)) {
            return this.reservedWordsMappings().get(name);
        }
        return "_" + name;
    }

    @Override
    public String toVarName(String name) {
        // sanitize name
        name = sanitizeName(name); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.

        if (name.toLowerCase().matches("^_*class$")) {
            return "propertyClass";
        }

        if("_".equals(name)) {
          name = "_u";
        }

        // if it's all uppper case, do nothing
        if (name.matches("^[A-Z_]*$")) {
            return name;
        }

        if(startsWithTwoUppercaseLetters(name)){
            name = name.substring(0, 2).toLowerCase() + name.substring(2);
        }

        // camelize (lower first character) the variable name
        // pet_id => petId
        name = camelize(name, true);

        // for reserved word or word starting with number, append _
        if (isReservedWord(name) || name.matches("^\\d.*")) {
            name = escapeReservedWord(name);
        }

        return name;
    }

    private boolean startsWithTwoUppercaseLetters(String name) {
        boolean startsWithTwoUppercaseLetters = false;
        if(name.length() > 1) {
            startsWithTwoUppercaseLetters = name.substring(0, 2).equals(name.substring(0, 2).toUpperCase());
        }
        return startsWithTwoUppercaseLetters;
    }

    @Override
    public String toParamName(String name) {
        // to avoid conflicts with 'callback' parameter for async call
        if ("callback".equals(name)) {
            return "paramCallback";
        }

        // should be the same as variable name
        return toVarName(name);
    }

    @Override
    public String toModelName(final String name) {

        final String sanitizedName = sanitizeName(name);

        String nameWithPrefixSuffix = sanitizedName;
        if (!StringUtils.isEmpty(modelNamePrefix)) {
            // add '_' so that model name can be camelized correctly
            nameWithPrefixSuffix = modelNamePrefix + "_" + nameWithPrefixSuffix;
        }

        if (!StringUtils.isEmpty(modelNameSuffix)) {
            // add '_' so that model name can be camelized correctly
            nameWithPrefixSuffix = nameWithPrefixSuffix + "_" + modelNameSuffix;
        }

        // camelize the model name
        // phone_number => PhoneNumber
        final String camelizedName = camelize(nameWithPrefixSuffix);

        // model name cannot use reserved keyword, e.g. return
        if (isReservedWord(camelizedName)) {
            final String modelName = "Model" + camelizedName;
            LOGGER.warn(camelizedName + " (reserved word) cannot be used as model name. Renamed to " + modelName);
            return modelName;
        }

        // model name starts with number
        if (camelizedName.matches("^\\d.*")) {
            final String modelName = "Model" + camelizedName; // e.g. 200Response => Model200Response (after camelize)
            LOGGER.warn(name + " (model name starts with number) cannot be used as model name. Renamed to " + modelName);
            return modelName;
        }

        return camelizedName;
    }

    @Override
    public String toModelFilename(String name) {
        // should be the same as the model name
        return toModelName(name);
    }

    @Override
    public String getTypeDeclaration(Property p) {
        if (p instanceof ArrayProperty) {
            ArrayProperty ap = (ArrayProperty) p;
            Property inner = ap.getItems();
            if (inner == null) {
                LOGGER.warn(ap.getName() + "(array property) does not have a proper inner type defined");
                // TODO maybe better defaulting to StringProperty than returning null
                return null;
            }
            return getSwaggerType(p) + "<" + getTypeDeclaration(inner) + ">";
        } else if (p instanceof MapProperty) {
            MapProperty mp = (MapProperty) p;
            Property inner = mp.getAdditionalProperties();
            if (inner == null) {
                LOGGER.warn(mp.getName() + "(map property) does not have a proper inner type defined");
                // TODO maybe better defaulting to StringProperty than returning null
                return null;
            }
            return getSwaggerType(p) + "<String, " + getTypeDeclaration(inner) + ">";
        }
        return super.getTypeDeclaration(p);
    }

    @Override
    public String getAlias(String name) {
        if (typeAliases != null && typeAliases.containsKey(name)) {
            return typeAliases.get(name);
        }
        return name;
    }

    @Override
    public String toDefaultValue(Property p) {
        if (p instanceof ArrayProperty) {
            final ArrayProperty ap = (ArrayProperty) p;
            final String pattern = "new ArrayList<%s>()";
            if (ap.getItems() == null) {
                return null;
            }

            return String.format(pattern, getTypeDeclaration(ap.getItems()));
        } else if (p instanceof MapProperty) {
            final MapProperty ap = (MapProperty) p;
            final String pattern = "new HashMap<%s>()";
            if (ap.getAdditionalProperties() == null) {
                return null;
            }

            return String.format(pattern, String.format("String, %s", getTypeDeclaration(ap.getAdditionalProperties())));
        } else if (p instanceof IntegerProperty) {
            IntegerProperty dp = (IntegerProperty) p;
            if (dp.getDefault() != null) {
                return dp.getDefault().toString();
            }
            return "null";
        } else if (p instanceof LongProperty) {
            LongProperty dp = (LongProperty) p;
            if (dp.getDefault() != null) {
                return dp.getDefault().toString()+"l";
            }
           return "null";
        } else if (p instanceof DoubleProperty) {
            DoubleProperty dp = (DoubleProperty) p;
            if (dp.getDefault() != null) {
                return dp.getDefault().toString() + "d";
            }
            return "null";
        } else if (p instanceof FloatProperty) {
            FloatProperty dp = (FloatProperty) p;
            if (dp.getDefault() != null) {
                return dp.getDefault().toString() + "f";
            }
            return "null";
        } else if (p instanceof BooleanProperty) {
            BooleanProperty bp = (BooleanProperty) p;
            if (bp.getDefault() != null) {
                return bp.getDefault().toString();
            }
            return "null";
        } else if (p instanceof StringProperty) {
            StringProperty sp = (StringProperty) p;
            if (sp.getDefault() != null) {
                String _default = sp.getDefault();
                if (sp.getEnum() == null) {
                    return "\"" + escapeText(_default) + "\"";
                } else {
                    // convert to enum var name later in postProcessModels
                    return _default;
                }
            }
            return "null";
        }
        return super.toDefaultValue(p);
    }

    @Override
    public void setParameterExampleValue(CodegenParameter p) {
 
        if (Boolean.TRUE.equals(p.isLong)) {
            p.example = "2147483648L";
        } else if (Boolean.TRUE.equals(p.isFile)) {
            p.example = "Blob.valueOf('Sample text file\\nContents')";
        } else if (Boolean.TRUE.equals(p.isDate)) {
            p.example = "Date.newInstance(1960, 2, 17)";
        } else if (Boolean.TRUE.equals(p.isDateTime)) {
            p.example = "Datetime.newInstanceGmt(2013, 11, 12, 3, 3, 3)";
        } else if (Boolean.TRUE.equals(p.isListContainer)) {
            p.example = "new " + p.dataType + "{" + p.items.example + "}";
        } else if (Boolean.TRUE.equals(p.isMapContainer)) {
            p.example = "new " + p.dataType + "{" + p.items.example + "}";
        } else if (Boolean.TRUE.equals(p.isString)) {
            p.example = "'" + p.example + "'";
        } else if ("".equals(p.example) || p.example == null && p.dataType != "Object") {
            // Get an example object from the generated model
            p.example = p.dataType + ".getExample()";
        }

    }

    @Override
    public String toExampleValue(Property p) {
        if (p == null) {
            return "";
        }

        Object obj = p.getExample();
        String example = obj == null ? "" : obj.toString();

        if (p instanceof ArrayProperty) {
            example = "new " + getTypeDeclaration(p) + "{" + toExampleValue(
                ((ArrayProperty) p).getItems()) + "}";
        } else if (p instanceof BooleanProperty) {
            example = String.valueOf(!"false".equals(example));
        } else if (p instanceof ByteArrayProperty) {
            if (example.isEmpty()) {
                example = "VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu";
            }
            ((ByteArrayProperty) p).setExample(example);
            example = "EncodingUtil.base64Decode('" + example + "')";
        } else if (p instanceof DateProperty) {
            if (example.matches("^\\d{4}(-\\d{2}){2}")) {
                example = example.substring(0, 10).replaceAll("-0?", ", ");
            } else if (example.isEmpty()) {
                example = "2000, 1, 23";
            } else {
                LOGGER.warn(String.format("The example provided for property '%s' is not a valid RFC3339 date. Defaulting to '2000-01-23'. [%s]", p
                    .getName(), example));
                example = "2000, 1, 23";
            }
            example = "Date.newInstance(" + example + ")";
        } else if (p instanceof DateTimeProperty) {
            if (example.matches("^\\d{4}([-T:]\\d{2}){5}.+")) {
                example = example.substring(0, 19).replaceAll("[-T:]0?", ", ");
            } else if (example.isEmpty()) {
                example = "2000, 1, 23, 4, 56, 7";
            } else {
                LOGGER.warn(String.format("The example provided for property '%s' is not a valid RFC3339 datetime. Defaulting to '2000-01-23T04-56-07Z'. [%s]", p
                    .getName(), example));
                example = "2000, 1, 23, 4, 56, 7";
            }
            example = "Datetime.newInstanceGmt(" + example + ")";
        } else if (p instanceof DecimalProperty) {
            example = example.replaceAll("[^-0-9.]", "");
            example = example.isEmpty() ? "1.3579" : example;
        } else if (p instanceof FileProperty) {
            if (example.isEmpty()) {
                example = "VGhlIHF1aWNrIGJyb3duIGZveCBqdW1wZWQgb3ZlciB0aGUgbGF6eSBkb2cu";
                ((FileProperty) p).setExample(example);
            }
            example = "EncodingUtil.base64Decode(" + example + ")";
        } else if (p instanceof EmailProperty) {
            if (example.isEmpty()) {
                example = "example@example.com";
                ((EmailProperty) p).setExample(example);
            }
            example = "'" + example + "'";
        } else if (p instanceof LongProperty) {
            example = example.isEmpty() ? "123456789L" : example + "L";
        } else if (p instanceof MapProperty) {
            example = "new " + getTypeDeclaration(p) + "{'key'=>" + toExampleValue(
                ((MapProperty) p).getAdditionalProperties()) + "}";
        } else if (p instanceof ObjectProperty) {
            example = example.isEmpty() ? "null" : example;
        } else if (p instanceof PasswordProperty) {
            example = example.isEmpty() ? "password123" : escapeText(example);
            ((PasswordProperty) p).setExample(example);
            example = "'" + example + "'";
        } else if (p instanceof RefProperty) {
            example = getTypeDeclaration(p) + ".getExample()";
            LOGGER.warn(example);
        } else if (p instanceof StringProperty) {
            StringProperty sp = (StringProperty) p;
            List<String> enums = sp.getEnum();
            if (enums != null && example.isEmpty()) {
                example = enums.get(0);
                sp.setExample(example);
            } else if (example.isEmpty()) {
                example = "";
            } else {
                example = escapeText(example);
                sp.setExample(example);
            }
            example = "'" + example + "'";
        } else if (p instanceof UUIDProperty) {
            example = example.isEmpty()
                ? "'046b6c7f-0b8a-43b9-b35d-6489e6daee91'"
                : "'" + escapeText(example) + "'";
        } else if (p instanceof BaseIntegerProperty) {
            example = example.matches("^-?\\d+$") ? example : "0";
        } else {
            example = super.toExampleValue(p);
        }
        return example;
    }

    @Override
    public String getSwaggerType(Property p) {
        String swaggerType = super.getSwaggerType(p);

        swaggerType = getAlias(swaggerType);

        // don't apply renaming on types from the typeMapping
        if (typeMapping.containsKey(swaggerType)) {
            return typeMapping.get(swaggerType);
        }

        if (null == swaggerType) {
            LOGGER.error("No Type defined for Property " + p);
        }
        return toModelName(swaggerType);
    }

    @Override
    public String toOperationId(String operationId) {
        // throw exception if method name is empty
        if (StringUtils.isEmpty(operationId)) {
            throw new RuntimeException("Empty method/operation name (operationId) not allowed");
        }

        operationId = camelize(sanitizeName(operationId), true);

        // method name cannot use reserved keyword, e.g. return
        if (isReservedWord(operationId)) {
            String newOperationId = camelize("call_" + operationId, true);
            LOGGER.warn(operationId + " (reserved word) cannot be used as method name. Renamed to " + newOperationId);
            return newOperationId;
        }

        return operationId;
    }

    @Override
    public CodegenModel fromModel(String name, Model model, Map<String, Model> allDefinitions) {
        CodegenModel cm = super.fromModel(name, model, allDefinitions);

        // TODO Check enum model handling
        if (cm.interfaces == null) {
            cm.interfaces = new ArrayList<String>();
        }

        Boolean hasDefaultValues = false;

        // for (de)serializing properties renamed for Apex (e.g. reserved words)
        List<Map<String, String>> propertyMappings = new ArrayList<>();
        for (CodegenProperty p : cm.allVars) {
            hasDefaultValues |= p.defaultValue != null;
            if (!p.baseName.equals(p.name)) {
                Map<String, String> mapping = new HashMap<>();
                mapping.put("externalName", p.baseName);
                mapping.put("internalName", p.name);
                propertyMappings.add(mapping);
            }
        }

        cm.vendorExtensions.put("hasPropertyMappings", !propertyMappings.isEmpty());
        cm.vendorExtensions.put("hasDefaultValues", hasDefaultValues);
        cm.vendorExtensions.put("propertyMappings", propertyMappings);

        if (!propertyMappings.isEmpty()) {
            cm.interfaces.add("Swagger.MappedProperties");
        }
        return cm;
    }

    @Override
    public void postProcessParameter(CodegenParameter parameter) {
        if (parameter.isBodyParam && parameter.isListContainer) {
            // items of array bodyParams are being nested an extra level too deep for some reason
            parameter.items = parameter.items.items;
            setParameterExampleValue(parameter);
        }
    }

    @Override
    public Map<String, Object> postProcessModels(Map<String, Object> objs) {
        return postProcessModelsEnum(objs);
    }

    private static String getAccept(Operation operation) {
        String accepts = null;
        String defaultContentType = "application/json";
        if (operation.getProduces() != null && !operation.getProduces().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (String produces : operation.getProduces()) {
                if (defaultContentType.equalsIgnoreCase(produces)) {
                    accepts = defaultContentType;
                    break;
                } else {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(produces);
                }
            }
            if (accepts == null) {
                accepts = sb.toString();
            }
        } else {
            accepts = defaultContentType;
        }

        return accepts;
    }

    @Override
    protected boolean needToImport(String type) {
        return super.needToImport(type) && type.indexOf(".") < 0;
    }

    @Override
    public String toEnumName(CodegenProperty property) {
        return sanitizeName(camelize(property.name)) + "Enum";
    }

    @Override
    public String toEnumVarName(String value, String datatype) {
        if (value.length() == 0) {
            return "EMPTY";
        }

        // for symbol, e.g. $, #
        if (getSymbolName(value) != null) {
            return getSymbolName(value).toUpperCase();
        }

        // number
        if ("Integer".equals(datatype) || "Long".equals(datatype) ||
            "Float".equals(datatype) || "Double".equals(datatype)) {
            String varName = "NUMBER_" + value;
            varName = varName.replaceAll("-", "MINUS_");
            varName = varName.replaceAll("\\+", "PLUS_");
            varName = varName.replaceAll("\\.", "_DOT_");
            return varName;
        }

        // string
        String var = value.replaceAll("\\W+", "_").toUpperCase();
        if (var.matches("\\d.*")) {
            return "_" + var;
        } else {
            return var;
        }
    }

    @Override
    public String toEnumValue(String value, String datatype) {
        if ("Integer".equals(datatype) || "Double".equals(datatype)) {
            return value;
        } else if ("Long".equals(datatype)) {
            // add l to number, e.g. 2048 => 2048l
            return value + "l";
        } else if ("Float".equals(datatype)) {
            // add f to number, e.g. 3.14 => 3.14f
            return value + "f";
        } else {
            return "\"" + escapeText(value) + "\"";
        }
    }

    @Override
    public CodegenOperation fromOperation(String path, String httpMethod, Operation operation, Map<String, Model> definitions, Swagger swagger) {
        Boolean hasFormParams = false;
        for (Parameter p : operation.getParameters()) {
            if ("formData".equals(p.getIn())) {
                hasFormParams = true;
                break;
            }
        }

        // only support serialization into JSON and urlencoded forms for now
        operation.setConsumes(
            Collections.singletonList(hasFormParams
                ? "application/x-www-form-urlencoded"
                : "application/json"));

        // only support deserialization from JSON for now
        operation.setProduces(Collections.singletonList("application/json"));

        CodegenOperation op = super.fromOperation(
            path, httpMethod, operation, definitions, swagger);
        if (op.getHasExamples()) {
            // prepare examples for Apex test classes
            Property responseProperty = findMethodResponse(operation.getResponses()).getSchema();
            String deserializedExample = toExampleValue(responseProperty);
            for (Map<String, String> example : op.examples) {
                example.put("example", escapeText(example.get("example")));
                example.put("deserializedExample", deserializedExample);
            }
        }

        return op;
    }

    private static CodegenModel reconcileInlineEnums(CodegenModel codegenModel, CodegenModel parentCodegenModel) {
        // This generator uses inline classes to define enums, which breaks when
        // dealing with models that have subTypes. To clean this up, we will analyze
        // the parent and child models, look for enums that match, and remove
        // them from the child models and leave them in the parent.
        // Because the child models extend the parents, the enums will be available via the parent.

        // Only bother with reconciliation if the parent model has enums.
        if  (!parentCodegenModel.hasEnums) {
            return codegenModel;
        }

        // Get the properties for the parent and child models
        final List<CodegenProperty> parentModelCodegenProperties = parentCodegenModel.vars;
        List<CodegenProperty> codegenProperties = codegenModel.vars;

        // Iterate over all of the parent model properties
        boolean removedChildEnum = false;
        for (CodegenProperty parentModelCodegenPropery : parentModelCodegenProperties) {
            // Look for enums
            if (parentModelCodegenPropery.isEnum) {
                // Now that we have found an enum in the parent class,
                // and search the child class for the same enum.
                Iterator<CodegenProperty> iterator = codegenProperties.iterator();
                while (iterator.hasNext()) {
                    CodegenProperty codegenProperty = iterator.next();
                    if (codegenProperty.isEnum && codegenProperty.equals(parentModelCodegenPropery)) {
                        // We found an enum in the child class that is
                        // a duplicate of the one in the parent, so remove it.
                        iterator.remove();
                        removedChildEnum = true;
                    }
                }
            }
        }

        if(removedChildEnum) {
            // If we removed an entry from this model's vars, we need to ensure hasMore is updated
            int count = 0, numVars = codegenProperties.size();
            for(CodegenProperty codegenProperty : codegenProperties) {
                count += 1;
                codegenProperty.hasMore = (count < numVars) ? true : false;
            }
            codegenModel.vars = codegenProperties;
        }
        return codegenModel;
    }

    private static String sanitizePackageName(String packageName) {
        packageName = packageName.trim(); // FIXME: a parameter should not be assigned. Also declare the methods parameters as 'final'.
        packageName = packageName.replaceAll("[^a-zA-Z0-9_\\.]", "_");
        if(Strings.isNullOrEmpty(packageName)) {
            return "invalidPackageName";
        }
        return packageName;
    }


    public void setSerializableModel(Boolean serializableModel) {
        this.serializableModel = serializableModel;
    }

    private String sanitizePath(String p) {
        //prefer replace a ", instead of a fuLL URL encode for readability
        return p.replaceAll("\"", "%22");
    }

    public String toRegularExpression(String pattern) {
        return escapeText(pattern);
    }

    public boolean convertPropertyToBoolean(String propertyKey) {
        boolean booleanValue = false;
        if (additionalProperties.containsKey(propertyKey)) {
            booleanValue = Boolean.valueOf(additionalProperties.get(propertyKey).toString());
        }

       return booleanValue;
    }

    public void writePropertyBack(String propertyKey, boolean value) {
        additionalProperties.put(propertyKey, value);
    }

    @Override
    public String sanitizeTag(String tag) {
        return camelize(sanitizeName(tag));
    }

    @Override
    public String toModelTestFilename(String name) {
        return toModelName(name) + "Test";
    }

}
