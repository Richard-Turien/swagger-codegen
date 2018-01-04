/**
 * Scala Client API Integration Test
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.ArrayByte
import java.util.Date
import io.swagger.client.model.Hobby
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

class HobbiesApi(
  val defBasePath: String = "https://localhost:8080",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  import org.json4s._

  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new HobbiesApiAsyncHelper(client, config)

  /**
   * Get hobbies
   * Query hobbies with some additional optional meaningless parameters
   *
   * @param s a string (optional, default to some string)
   * @param i an integer (optional, default to 1)
   * @param l a long (optional, default to 2)
   * @param bool a bool (optional, default to true)
   * @param f a float (optional, default to 0.1)
   * @param d a double (optional, default to 10.005)
   * @param datetime a date time (optional, default to 2018-01-01T08:30:00Z-04:00)
   * @param date a date (optional, default to 2018-01-01)
   * @param b a base64 encoded string (optional, default to c3dhZ2dlciBjb2RlZ2Vu)
   * @param bin an octet string (optional, default to DEADBEEF)
   * @return Hobby
   */
  def getHobbies(s: Option[String] = Option("some string"), i: Option[Integer] = Option(1), l: Option[Long] = Option(2), bool: Option[Boolean] = Option(true), f: Option[Float] = Option(0.1), d: Option[Double] = Option(10.005), datetime: Option[Date] = Option(dateTimeFormatter.parse("2018-01-01T08:30:00Z-04:00")), date: Option[Date] = Option(dateFormatter.parse("2018-01-01")), b: Option[ArrayByte] = Option("c3dhZ2dlciBjb2RlZ2Vu".getBytes), bin: Option[ArrayByte] = Option("DEADBEEF".getBytes)): Option[Hobby] = {
    val await = Try(Await.result(getHobbiesAsync(s, i, l, bool, f, d, datetime, date, b, bin), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get hobbies asynchronously
   * Query hobbies with some additional optional meaningless parameters
   *
   * @param s a string (optional, default to some string)
   * @param i an integer (optional, default to 1)
   * @param l a long (optional, default to 2)
   * @param bool a bool (optional, default to true)
   * @param f a float (optional, default to 0.1)
   * @param d a double (optional, default to 10.005)
   * @param datetime a date time (optional, default to 2018-01-01T08:30:00Z-04:00)
   * @param date a date (optional, default to 2018-01-01)
   * @param b a base64 encoded string (optional, default to c3dhZ2dlciBjb2RlZ2Vu)
   * @param bin an octet string (optional, default to DEADBEEF)
   * @return Future(Hobby)
   */
  def getHobbiesAsync(s: Option[String] = Option("some string"), i: Option[Integer] = Option(1), l: Option[Long] = Option(2), bool: Option[Boolean] = Option(true), f: Option[Float] = Option(0.1), d: Option[Double] = Option(10.005), datetime: Option[Date] = Option(dateTimeFormatter.parse("2018-01-01T08:30:00Z-04:00")), date: Option[Date] = Option(dateFormatter.parse("2018-01-01")), b: Option[ArrayByte] = Option("c3dhZ2dlciBjb2RlZ2Vu".getBytes), bin: Option[ArrayByte] = Option("DEADBEEF".getBytes)): Future[Hobby] = {
      helper.getHobbies(s, i, l, bool, f, d, datetime, date, b, bin)
  }

}

class HobbiesApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getHobbies(s: Option[String] = Option("some string"),
    i: Option[Integer] = Option(1),
    l: Option[Long] = Option(2),
    bool: Option[Boolean] = Option(true),
    f: Option[Float] = Option(0.1),
    d: Option[Double] = Option(10.005),
    datetime: Option[Date] = Option(dateTimeFormatter.parse("2018-01-01T08:30:00Z-04:00")),
    date: Option[Date] = Option(dateFormatter.parse("2018-01-01")),
    b: Option[ArrayByte] = Option("c3dhZ2dlciBjb2RlZ2Vu".getBytes),
    bin: Option[ArrayByte] = Option("DEADBEEF".getBytes)
    )(implicit reader: ClientResponseReader[Hobby]): Future[Hobby] = {
    // create path and map variables
    val path = (addFmt("/hobbies"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    s match {
      case Some(param) => queryParams += "s" -> param.toString
      case _ => queryParams
    }
    i match {
      case Some(param) => queryParams += "i" -> param.toString
      case _ => queryParams
    }
    l match {
      case Some(param) => queryParams += "l" -> param.toString
      case _ => queryParams
    }
    bool match {
      case Some(param) => queryParams += "bool" -> param.toString
      case _ => queryParams
    }
    f match {
      case Some(param) => queryParams += "f" -> param.toString
      case _ => queryParams
    }
    d match {
      case Some(param) => queryParams += "d" -> param.toString
      case _ => queryParams
    }
    datetime match {
      case Some(param) => queryParams += "datetime" -> param.toString
      case _ => queryParams
    }
    date match {
      case Some(param) => queryParams += "date" -> param.toString
      case _ => queryParams
    }
    b match {
      case Some(param) => queryParams += "b" -> param.toString
      case _ => queryParams
    }
    bin match {
      case Some(param) => queryParams += "bin" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
