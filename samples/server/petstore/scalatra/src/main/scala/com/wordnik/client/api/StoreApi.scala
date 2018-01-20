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
package com.wordnik.client.api

import com.wordnik.client.model.Order

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class StoreApi (implicit val swagger: Swagger) extends ScalatraServlet
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "StoreApi"
  override protected val applicationName: Option[String] = Some("/v2/Store")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val deleteOrderOperation = (apiOperation[Unit]("deleteOrder")
      summary "Delete purchase order by ID"
      parameters(pathParam[String]("orderId").description(""))
  )

  delete("/store/order/:orderId",operation(deleteOrderOperation)) {
    
    
      val orderId = params.getOrElse("orderId", halt(400))
    
    println("orderId: " + orderId)
  }

  

  val getInventoryOperation = (apiOperation[Map[String, Int]]("getInventory")
      summary "Returns pet inventories by status"
      parameters()
  )

  get("/store/inventory",operation(getInventoryOperation)) {
  }

  

  val getOrderByIdOperation = (apiOperation[Order]("getOrderById")
      summary "Find purchase order by ID"
      parameters(pathParam[Long]("orderId").description(""))
  )

  get("/store/order/:orderId",operation(getOrderByIdOperation)) {
    
    
      val orderId = params.getOrElse("orderId", halt(400))
    
    println("orderId: " + orderId)
  }

  

  val placeOrderOperation = (apiOperation[Order]("placeOrder")
      summary "Place an order for a pet"
      parameters(bodyParam[Order]("body").description(""))
  )

  post("/store/order",operation(placeOrderOperation)) {
    
    
          val body = parsedBody.extract[Order]

    println("body: " + body)
  }

}
