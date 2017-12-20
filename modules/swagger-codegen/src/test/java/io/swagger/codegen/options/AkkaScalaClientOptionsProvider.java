package io.swagger.codegen.options;

import io.swagger.codegen.CodegenConstants;

import com.google.common.collect.ImmutableMap;

import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.Map;

public class AkkaScalaClientOptionsProvider implements OptionsProvider {
    public static final String SOURCE_FOLDER_VALUE = "sourceFolder";
    public static final String MODEL_PACKAGE_VALUE = "package";
    public static final String API_PACKAGE_VALUE = "apiPackage";
    public static final String SORT_PARAMS_VALUE = "false";
    public static final String ENSURE_UNIQUE_PARAMS_VALUE = "true";
    public static final String ALLOW_UNICODE_IDENTIFIERS_VALUE = "false";
    public static final String BUILD_TOOL = "buildTool";

    @Override
    public String getLanguage() {
        return "akka-scala";
    }

    @Override
    public Map<String, String> createOptions() {
        ImmutableMap.Builder<String, String> builder = new ImmutableMap.Builder<String, String>();
        return builder.put(CodegenConstants.MODEL_PACKAGE, MODEL_PACKAGE_VALUE)
                .put(CodegenConstants.API_PACKAGE, API_PACKAGE_VALUE)
                .put(CodegenConstants.SORT_PARAMS_BY_REQUIRED_FLAG, SORT_PARAMS_VALUE)
                .put(CodegenConstants.ENSURE_UNIQUE_PARAMS, ENSURE_UNIQUE_PARAMS_VALUE)
                .put(CodegenConstants.SOURCE_FOLDER, SOURCE_FOLDER_VALUE)
                .put(CodegenConstants.ALLOW_UNICODE_IDENTIFIERS, ALLOW_UNICODE_IDENTIFIERS_VALUE)
                .put(CodegenConstants.BUILD_TOOL, BUILD_TOOL)
                .build();
    }

    @Override
    public boolean isServer() {
        return false;
    }
}
