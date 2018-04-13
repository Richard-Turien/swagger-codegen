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
import { HttpHeaders }                                       from '@angular/common/http';

import { Observable }                                        from 'rxjs/Observable';


import { User } from '../model/user';


import { Configuration }                                     from '../configuration';


export interface UserServiceInterface {
    defaultHeaders: HttpHeaders;
    configuration: Configuration;
    [others: string]: any;

    /**
    * Create user
    * This can only be done by the logged in user.
    * @param body Created user object
    */
    createUser(body: User, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Creates list of users with given input array
    * 
    * @param body List of user object
    */
    createUsersWithArrayInput(body: Array<User>, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Creates list of users with given input array
    * 
    * @param body List of user object
    */
    createUsersWithListInput(body: Array<User>, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Delete user
    * This can only be done by the logged in user.
    * @param username The name that needs to be deleted
    */
    deleteUser(username: string, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Get user by user name
    * 
    * @param username The name that needs to be fetched. Use user1 for testing.
    */
    getUserByName(username: string, extraHttpRequestParams?: any): Observable<User>;

    /**
    * Logs user into the system
    * 
    * @param username The user name for login
    * @param password The password for login in clear text
    */
    loginUser(username: string, password: string, extraHttpRequestParams?: any): Observable<string>;

    /**
    * Logs out current logged in user session
    * 
    */
    logoutUser(extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Updated user
    * This can only be done by the logged in user.
    * @param username name that need to be deleted
    * @param body Updated user object
    */
    updateUser(username: string, body: User, extraHttpRequestParams?: any): Observable<{}>;

}
