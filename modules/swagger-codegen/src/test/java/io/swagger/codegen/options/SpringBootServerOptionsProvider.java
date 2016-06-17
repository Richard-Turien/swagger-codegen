package io.swagger.codegen.options;

import io.swagger.codegen.CodegenConstants;
import io.swagger.codegen.languages.SpringBootServerCodegen;

import java.util.HashMap;
import java.util.Map;

public class SpringBootServerOptionsProvider extends JavaOptionsProvider {
    public static final String CONFIG_PACKAGE_VALUE = "configPackage";
    public static final String BASE_PACKAGE_VALUE = "basePackage";
    public static final String LIBRARY_VALUE = "j8-async"; //FIXME hidding value from super class
    public static final String INTERFACE_ONLY = "true";
    public static final String SINGLE_CONTENT_TYPES = "true";
    public static final String JAVA_8 = "true";
    public static final String ASYNC = "true";

    @Override
    public String getLanguage() {
        return "springboot";
    }

    @Override
    public Map<String, String> createOptions() {
        Map<String, String> options = new HashMap<String, String>(super.createOptions());
        options.put(SpringBootServerCodegen.CONFIG_PACKAGE, CONFIG_PACKAGE_VALUE);
        options.put(SpringBootServerCodegen.BASE_PACKAGE, BASE_PACKAGE_VALUE);
        options.put(CodegenConstants.LIBRARY, LIBRARY_VALUE);
        options.put(SpringBootServerCodegen.INTERFACE_ONLY, INTERFACE_ONLY);
        options.put(SpringBootServerCodegen.SINGLE_CONTENT_TYPES, SINGLE_CONTENT_TYPES);
        options.put(SpringBootServerCodegen.JAVA_8, JAVA_8);
        options.put(SpringBootServerCodegen.ASYNC, ASYNC);

        return options;
    }

    @Override
    public boolean isServer() {
        return true;
    }
}
