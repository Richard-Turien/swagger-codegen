package io.swagger.client.api;

import java.util.Map;

import io.swagger.client.model.Order;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface StoreApi {
    /**
     * Delete purchase order by ID Sync method For valid response try integer IDs with value &lt;
     * 1000. Anything above 1000 or nonintegers will generate API errors
     *
     * @param orderId ID of the order that needs to be deleted (required)
     * @return Void
     */

    @DELETE("/store/order/{orderId}")
    Void deleteOrder(
            @Path("orderId") String orderId
    );

    /**
     * Delete purchase order by ID Async method
     *
     * @param orderId ID of the order that needs to be deleted (required)
     * @param cb      callback method
     * @return void
     */

    @DELETE("/store/order/{orderId}")
    void deleteOrder(
            @Path("orderId") String orderId, Callback<Void> cb
    );

    /**
     * Returns pet inventories by status Sync method Returns a map of status codes to quantities
     *
     * @return Map<String, Integer>
     */

    @GET("/store/inventory")
    Map<String, Integer> getInventory();


    /**
     * Returns pet inventories by status Async method
     *
     * @param cb callback method
     * @return void
     */

    @GET("/store/inventory")
    void getInventory(
            Callback<Map<String, Integer>> cb
    );

    /**
     * Find purchase order by ID Sync method For valid response try integer IDs with value
     * &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @return Order
     */

    @GET("/store/order/{orderId}")
    Order getOrderById(
            @Path("orderId") Long orderId
    );

    /**
     * Find purchase order by ID Async method
     *
     * @param orderId ID of pet that needs to be fetched (required)
     * @param cb      callback method
     * @return void
     */

    @GET("/store/order/{orderId}")
    void getOrderById(
            @Path("orderId") Long orderId, Callback<Order> cb
    );

    /**
     * Place an order for a pet Sync method
     *
     * @param body order placed for purchasing the pet (required)
     * @return Order
     */

    @POST("/store/order")
    Order placeOrder(
            @Body Order body
    );

    /**
     * Place an order for a pet Async method
     *
     * @param body order placed for purchasing the pet (required)
     * @param cb   callback method
     * @return void
     */

    @POST("/store/order")
    void placeOrder(
            @Body Order body, Callback<Order> cb
    );
}
