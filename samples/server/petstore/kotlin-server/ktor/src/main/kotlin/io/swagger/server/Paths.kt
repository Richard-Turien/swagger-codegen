/**
* Swagger Petstore
* This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
*
* OpenAPI spec version: 1.0.0
* Contact: apiteam@swagger.io
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package io.swagger.server

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpMethod
import io.ktor.locations.*
import io.ktor.pipeline.PipelineContext
import io.ktor.routing.Route
import io.ktor.routing.method
import io.swagger.server.models.*


object Paths {
    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete 
     * @param apiKey  (optional)
     */
    @Location("/pet/{petId}") class deletePet(val petId: kotlin.Long, val apiKey: kotlin.String)

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter 
     */
    @Location("/pet/findByStatus") class findPetsByStatus(val status: kotlin.Array<kotlin.String>)

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by 
     */
    @Location("/pet/findByTags") class findPetsByTags(val tags: kotlin.Array<kotlin.String>)

    /**
     * Find pet by ID
     * Returns a single pet
     * @param petId ID of pet to return 
     */
    @Location("/pet/{petId}") class getPetById(val petId: kotlin.Long)

    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with value &lt; 1000. Anything above 1000 or nonintegers will generate API errors
     * @param orderId ID of the order that needs to be deleted 
     */
    @Location("/store/order/{orderId}") class deleteOrder(val orderId: kotlin.String)

    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     */
    @Location("/store/inventory") class getInventory()

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &lt;&#x3D; 5 or &gt; 10. Other values will generated exceptions
     * @param orderId ID of pet that needs to be fetched 
     */
    @Location("/store/order/{orderId}") class getOrderById(val orderId: kotlin.Long)

    /**
     * Delete user
     * This can only be done by the logged in user.
     * @param username The name that needs to be deleted 
     */
    @Location("/user/{username}") class deleteUser(val username: kotlin.String)

    /**
     * Get user by user name
     * 
     * @param username The name that needs to be fetched. Use user1 for testing. 
     */
    @Location("/user/{username}") class getUserByName(val username: kotlin.String)

    /**
     * Logs user into the system
     * 
     * @param username The user name for login 
     * @param password The password for login in clear text 
     */
    @Location("/user/login") class loginUser(val username: kotlin.String, val password: kotlin.String)

    /**
     * Logs out current logged in user session
     * 
     */
    @Location("/user/logout") class logoutUser()

}
