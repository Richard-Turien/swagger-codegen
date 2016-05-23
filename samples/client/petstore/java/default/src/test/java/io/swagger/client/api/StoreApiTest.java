package io.swagger.client.api;

import org.junit.Test;

import io.swagger.client.ApiException;
import io.swagger.client.model.Order;

/**
 * API tests for StoreApi
 */
public class StoreApiTest {

    private final StoreApi api = new StoreApi();


    /**
     * Delete purchase order by ID
     *
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers
     * will generate API errors
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteOrderTest() throws ApiException {
        String orderId = null;
        // api.deleteOrder(orderId);

        // TODO: test validations
    }

    /**
     * Returns pet inventories by status
     *
     * Returns a map of status codes to quantities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInventoryTest() throws ApiException {
        // Map<String, Integer> response = api.getInventory();

        // TODO: test validations
    }

    /**
     * Find purchase order by ID
     *
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will
     * generated exceptions
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getOrderByIdTest() throws ApiException {
        Long orderId = null;
        // Order response = api.getOrderById(orderId);

        // TODO: test validations
    }

    /**
     * Place an order for a pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void placeOrderTest() throws ApiException {
        Order body = null;
        // Order response = api.placeOrder(body);

        // TODO: test validations
    }

}
