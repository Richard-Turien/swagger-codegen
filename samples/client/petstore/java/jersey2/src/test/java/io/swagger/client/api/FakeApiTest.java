package io.swagger.client.api;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.client.ApiException;

/**
 * API tests for FakeApi
 */
public class FakeApiTest {

    private final FakeApi api = new FakeApi();


    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트
     *
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void testEndpointParametersTest() throws ApiException {
        BigDecimal number = null;
        Double _double = null;
        String string = null;
        byte[] _byte = null;
        Integer integer = null;
        Integer int32 = null;
        Long int64 = null;
        Float _float = null;
        byte[] binary = null;
        Date date = null;
        Date dateTime = null;
        String password = null;
        // api.testEndpointParameters(number, _double, string, _byte, integer, int32, int64, _float, binary, date, dateTime, password);

        // TODO: test validations
    }

}
