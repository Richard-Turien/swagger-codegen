/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 */

package io.swagger.server.model

// see https://com-lihaoyi.github.io/upickle/
import upickle.default.{ReadWriter => RW, macroRW}
import upickle.default.*

case class Pet(
  id: Option[Long],
    category: Option[Category],
    name: String,
    photoUrls: List[String],
    tags: Option[List[Tag]],
  /* pet status in the store */
  status: Option[String]
  ) {

  def asJson = write(this)

}

object Pet{
  implicit val rw: RW[Pet] = macroRW

  def fromJsonString(jason : String) : Pet = read[Pet](jason)

  def manyFromJsonString(jason : String) : List[Pet] = read[List[Pet]](jason)

  def mapFromJsonString(jason : String) : Map[String, Pet] = read[Map[String, Pet]](jason)

}

