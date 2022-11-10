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


package io.swagger.server.api

enum ServiceResponse[+A]:
    case Ok[T](result: T) extends ServiceResponse[T]
    case Other(code: Int, description: Option[String]) extends ServiceResponse[Nothing]
    case NotFound extends ServiceResponse[Nothing]

object ServiceResponse {
  def apply[A](value: A) = Ok(value)
  def apply[A](code: Int, description: String = ""): ServiceResponse[A] = Other(code, Option(description.trim).filterNot(_.isEmpty))
  def notFound[A]: ServiceResponse[A] = NotFound
  def notImplemented[A]: ServiceResponse[A] = apply(500, "not implemented")
}
