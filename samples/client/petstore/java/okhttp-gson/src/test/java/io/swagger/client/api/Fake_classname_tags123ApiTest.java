/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Client;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for Fake_classname_tags123Api
 */
@Ignore
public class Fake_classname_tags123ApiTest {

    private final Fake_classname_tags123Api api = new Fake_classname_tags123Api();

    
    /**
     * To test class name in snake case
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void testClassnameTest() throws ApiException {
        Client body = null;
        Client response = api.testClassname(body);

        // TODO: test validations
    }
    
}
