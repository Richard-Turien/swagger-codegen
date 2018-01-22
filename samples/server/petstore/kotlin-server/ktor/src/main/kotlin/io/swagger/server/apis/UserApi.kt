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
package io.swagger.server.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.auth.UserIdPrincipal
import io.ktor.auth.authentication
import io.ktor.auth.basicAuthentication
import io.ktor.auth.oauth
import io.ktor.auth.OAuthAccessTokenResponse
import io.ktor.auth.OAuthServerSettings
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.locations.*
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*

import kotlinx.coroutines.experimental.asCoroutineDispatcher

import io.swagger.server.ApplicationAuthProviders
import io.swagger.server.Paths
import io.swagger.server.ApplicationExecutors
import io.swagger.server.HTTP.client
import io.swagger.server.infrastructure.ApiPrincipal
import io.swagger.server.infrastructure.apiKeyAuth

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288
import io.swagger.server.delete

import io.swagger.server.models.User

fun Route.UserApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    route("/user") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/user/createWithArray") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/user/createWithList") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    delete<Paths.deleteUser> {  it: Paths.deleteUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    

    get<Paths.getUserByName> {  it: Paths.getUserByName ->
        val exampleContentType = "application/xml"
        val exampleContentString = """<User>
          <id>123456789</id>
          <username>aeiou</username>
          <firstName>aeiou</firstName>
          <lastName>aeiou</lastName>
          <email>aeiou</email>
          <password>aeiou</password>
          <phone>aeiou</phone>
          <userStatus>123</userStatus>
        </User>"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.loginUser> {  it: Paths.loginUser ->
        val exampleContentType = "application/xml"
        val exampleContentString = """aeiou"""
        
        when(exampleContentType) {
            "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
            "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
            else -> call.respondText(exampleContentString)
        }
    }
    

    get<Paths.logoutUser> {  it: Paths.logoutUser ->
        call.respond(HttpStatusCode.NotImplemented)
    }
    

    route("/user/{username}") {
        put {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    
}
