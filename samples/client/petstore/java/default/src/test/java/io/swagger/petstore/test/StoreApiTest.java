package io.swagger.petstore.test;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Map;

import io.swagger.TestUtils;
import io.swagger.client.ApiException;
import io.swagger.client.api.StoreApi;
import io.swagger.client.auth.ApiKeyAuth;
import io.swagger.client.model.Order;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StoreApiTest {
    StoreApi api = null;

    @Before
    public void setup() {
        api = new StoreApi();
        // setup authentication
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) api.getApiClient().getAuthentication("api_key");
        apiKeyAuth.setApiKey("special-key");
        // set custom date format that is used by the petstore server
        api.getApiClient().setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
    }

    @Test
    public void testGetInventory() throws Exception {
        Map<String, Integer> inventory = api.getInventory();
        assertTrue(inventory.keySet().size() > 0);
    }

    /*
    @Test
    public void testGetInventoryInObject() throws Exception {
        Object inventoryObj = api.getInventoryInObject();
        assertTrue(inventoryObj instanceof Map);

        Map inventoryMap = (Map) inventoryObj;
        assertTrue(inventoryMap.keySet().size() > 0);

        Map.Entry firstEntry = (Map.Entry) inventoryMap.entrySet().iterator().next();
        assertTrue(firstEntry.getKey() instanceof String);
        assertTrue(firstEntry.getValue() instanceof Integer);
    }
    */

    @Test
    public void testPlaceOrder() throws Exception {
        Order order = createOrder();
        api.placeOrder(order);

        Order fetched = api.getOrderById(order.getId());
        assertEquals(order.getId(), fetched.getId());
        assertEquals(order.getPetId(), fetched.getPetId());
        assertEquals(order.getQuantity(), fetched.getQuantity());
    }

    @Test
    public void testDeleteOrder() throws Exception {
        Order order = createOrder();
        api.placeOrder(order);

        Order fetched = api.getOrderById(order.getId());
        assertEquals(fetched.getId(), order.getId());

        api.deleteOrder(String.valueOf(order.getId()));

        try {
            api.getOrderById(order.getId());
            // fail("expected an error");
        } catch (ApiException e) {
            // ok
        }
    }

    private Order createOrder() {
        Order order = new Order();
        order.setPetId(new Long(200));
        order.setQuantity(new Integer(13));
        order.setShipDate(new java.util.Date());
        order.setStatus(Order.StatusEnum.PLACED);
        order.setComplete(true);

        try {
            Field idField = Order.class.getDeclaredField("id");
            idField.setAccessible(true);
            idField.set(order, TestUtils.nextId());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return order;
    }
}
