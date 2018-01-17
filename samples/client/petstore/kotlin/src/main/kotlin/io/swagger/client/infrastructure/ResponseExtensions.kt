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
package io.swagger.client.infrastructure

import okhttp3.Response

/**
 * Provides an extension to evaluation whether the response is a 1xx code
 */
val Response.isInformational : Boolean get() = this.code() in 100..199

/**
 * Provides an extension to evaluation whether the response is a 3xx code
 */
val Response.isRedirect : Boolean get() = this.code() in 300..399

/**
 * Provides an extension to evaluation whether the response is a 4xx code
 */
val Response.isClientError : Boolean get() = this.code() in 400..499

/**
 * Provides an extension to evaluation whether the response is a 5xx (Standard) through 999 (non-standard) code
 */
val Response.isServerError : Boolean get() = this.code() in 500..999