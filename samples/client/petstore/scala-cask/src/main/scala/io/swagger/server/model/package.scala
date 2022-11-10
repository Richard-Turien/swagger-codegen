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

// model package
import upickle.default._
import java.time.*
import java.time.format.DateTimeFormatter

given ReadWriter[ZonedDateTime] = readwriter[String].bimap[ZonedDateTime](
  zonedDateTime => DateTimeFormatter.ISO_INSTANT.format(zonedDateTime),
  str => ZonedDateTime.parse(str, DateTimeFormatter.ISO_INSTANT))

given ReadWriter[LocalDateTime] = readwriter[String].bimap[LocalDateTime](
    zonedDateTime => DateTimeFormatter.ISO_INSTANT.format(zonedDateTime),
    str => LocalDateTime.parse(str, DateTimeFormatter.ISO_INSTANT))

given ReadWriter[LocalDate] = readwriter[String].bimap[LocalDate](
    zonedDateTime => DateTimeFormatter.ISO_INSTANT.format(zonedDateTime),
    str => LocalDate.parse(str, DateTimeFormatter.ISO_INSTANT))