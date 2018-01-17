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
package io.swagger.client.model
import play.api.libs.json._

case class User (
                  id: Option[Long],
                  username: Option[String],
                  firstName: Option[String],
                  lastName: Option[String],
                  email: Option[String],
                  password: Option[String],
                  phone: Option[String],
            /* User Status */
                  userStatus: Option[Int]
)

object User {
implicit val format: Format[User] = Json.format
}

