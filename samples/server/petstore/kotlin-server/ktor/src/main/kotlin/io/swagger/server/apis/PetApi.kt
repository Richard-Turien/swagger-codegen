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

import com.google.gson.*
import io.ktor.application.*
import io.ktor.auth.*
import io.ktor.http.*
import io.ktor.locations.*
import io.ktor.response.*
import io.ktor.routing.*
import io.swagger.server.*
import io.swagger.server.infrastructure.*
import io.swagger.server.*

import io.swagger.server.models.ApiResponse
import io.swagger.server.models.Pet

fun Route.PetApi() {
    val gson = Gson()
    authenticate("apikey-api_key") {
        get<Paths.getPetById> {
            val principal = call.authentication.principal<ApiPrincipal>()
            
            if (principal == null) {
                call.respond(HttpStatusCode.Unauthorized)
            } else {
                val exampleContentType = "application/xml"
                val exampleContentString = """<Pet>
                  <id>123456789</id>
                  <name>doggie</name>
                  <photoUrls>
                    <photoUrls>aeiou</photoUrls>
                  </photoUrls>
                  <tags>
                  </tags>
                  <status>aeiou</status>
                </Pet>"""
                
                when(exampleContentType) {
                    "application/json" -> call.respond(gson.fromJson(exampleContentString, MutableMap::class.java))
                    "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                    else -> call.respondText(exampleContentString)
                }
            }
        }
    }
}
