package io.swagger.codegen.phpsymfony;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.swagger.codegen.CodegenConstants;
import io.swagger.codegen.languages.SymfonyServerCodegen;

public class SymfonyServerCodegenTest {

    @Test
    public void testInitialConfigValues() throws Exception {
        final SymfonyServerCodegen codegen = new SymfonyServerCodegen();
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.TRUE);
    }

    @Test
    public void testSettersForConfigValues() throws Exception {
        final SymfonyServerCodegen codegen = new SymfonyServerCodegen();
        codegen.setHideGenerationTimestamp(false);
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.FALSE);
    }

    @Test
    public void testAdditionalPropertiesPutForConfigValues() throws Exception {
        final SymfonyServerCodegen codegen = new SymfonyServerCodegen();
        codegen.additionalProperties().put(CodegenConstants.HIDE_GENERATION_TIMESTAMP, false);
        codegen.processOpts();

        Assert.assertEquals(codegen.additionalProperties().get(CodegenConstants.HIDE_GENERATION_TIMESTAMP), Boolean.FALSE);
    }

}
