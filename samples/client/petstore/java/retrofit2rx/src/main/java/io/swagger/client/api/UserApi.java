package io.swagger.client.api;

import java.util.List;

import io.swagger.client.model.User;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface UserApi {
    /**
     * Create user This can only be done by the logged in user.
     *
     * @param body Created user object (required)
     * @return Call<Void>
     */

    @POST("user")
    Observable<Void> createUser(
            @Body User body
    );

    /**
     * Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return Call<Void>
     */

    @POST("user/createWithArray")
    Observable<Void> createUsersWithArrayInput(
            @Body List<User> body
    );

    /**
     * Creates list of users with given input array
     *
     * @param body List of user object (required)
     * @return Call<Void>
     */

    @POST("user/createWithList")
    Observable<Void> createUsersWithListInput(
            @Body List<User> body
    );

    /**
     * Delete user This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Call<Void>
     */

    @DELETE("user/{username}")
    Observable<Void> deleteUser(
            @Path("username") String username
    );

    /**
     * Get user by user name
     *
     * @param username The name that needs to be fetched. Use user1 for testing.  (required)
     * @return Call<User>
     */

    @GET("user/{username}")
    Observable<User> getUserByName(
            @Path("username") String username
    );

    /**
     * Logs user into the system
     *
     * @param username The user name for login (required)
     * @param password The password for login in clear text (required)
     * @return Call<String>
     */

    @GET("user/login")
    Observable<String> loginUser(
            @Query("username") String username, @Query("password") String password
    );

    /**
     * Logs out current logged in user session
     *
     * @return Call<Void>
     */

    @GET("user/logout")
    Observable<Void> logoutUser();


    /**
     * Updated user This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param body     Updated user object (required)
     * @return Call<Void>
     */

    @PUT("user/{username}")
    Observable<Void> updateUser(
            @Path("username") String username, @Body User body
    );

}
