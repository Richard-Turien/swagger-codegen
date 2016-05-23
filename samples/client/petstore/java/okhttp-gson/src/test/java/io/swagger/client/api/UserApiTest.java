package io.swagger.client.api;

import org.junit.Test;

import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.model.User;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private final UserApi api = new UserApi();


    /**
     * Create user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        User body = null;
        // api.createUser(body);

        // TODO: test validations
    }

    /**
     * Creates list of users with given input array
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUsersWithArrayInputTest() throws ApiException {
        List<User> body = null;
        // api.createUsersWithArrayInput(body);

        // TODO: test validations
    }

    /**
     * Creates list of users with given input array
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUsersWithListInputTest() throws ApiException {
        List<User> body = null;
        // api.createUsersWithListInput(body);

        // TODO: test validations
    }

    /**
     * Delete user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        String username = null;
        // api.deleteUser(username);

        // TODO: test validations
    }

    /**
     * Get user by user name
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserByNameTest() throws ApiException {
        String username = null;
        // User response = api.getUserByName(username);

        // TODO: test validations
    }

    /**
     * Logs user into the system
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginUserTest() throws ApiException {
        String username = null;
        String password = null;
        // String response = api.loginUser(username, password);

        // TODO: test validations
    }

    /**
     * Logs out current logged in user session
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutUserTest() throws ApiException {
        // api.logoutUser();

        // TODO: test validations
    }

    /**
     * Updated user
     *
     * This can only be done by the logged in user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        String username = null;
        User body = null;
        // api.updateUser(username, body);

        // TODO: test validations
    }

}
