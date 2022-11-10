//> using scala "3.2.0"
//> using lib "com.lihaoyi::cask:0.8.3"
//> using lib "com.lihaoyi::scalatags:0.12.0"
//> using lib "com.softwaremill.sttp.client3::core:3.8.3"
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

import io.swagger.server.model.Order


final case class StoreRoutes(service : StoreService) extends cask.Routes {

        
        /** Delete purchase order by ID
         * 
         */
        @cask.delete("/store/order/:orderId")
        def deleteOrder(orderId : String, request: cask.Request) = {

        val serviceResponse =         for {
            
            orderId <- Parsed(orderId)
            result <- Parsed.eval(service.deleteOrder(orderId))
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Returns pet inventories by status
         * 
         */
        @cask.get("/store/inventory")
        def getInventory(request: cask.Request) = {
            // auth method api_key : apiKey, keyParamName: api_key

        val serviceResponse =         for {
            result <- Parsed.eval(service.getInventory())
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Find purchase order by ID
         * 
         */
        @cask.get("/store/order/:orderId")
        def getOrderById(orderId : Long, request: cask.Request) = {

        val serviceResponse =         for {
            
            orderId <- Parsed(orderId)
            result <- Parsed.eval(service.getOrderById(orderId))
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Place an order for a pet
         * 
         */
        @cask.post("/store/order")
        def placeOrder(request: cask.Request) = {

        val serviceResponse =         for {
            
            /** TODO - this is a bit of a hack - we should do content type negotiation */
            body <- Parsed.eval(Order.fromJsonString(request.bodyAsString))
            result <- Parsed.eval(service.placeOrder(body))
        } yield result

        asHttpResponse(serviceResponse)
      }

  private def asHttpResponse[A](serviceResponse : Either[String, ServiceResponse[A]]): cask.Response[String] = {
        serviceResponse match {
            case Right(ServiceResponse.Ok(value)) => cask.Response(value.toString())
            case Right(ServiceResponse.NotFound) => cask.Response("Not Found", statusCode = 404)
            case Right(ServiceResponse.Other(code, msg)) => cask.Response(msg.getOrElse(s"Service returned $code"), statusCode = code)
            case Left(err) => cask.Response(s"Error: $err", statusCode = 500)
        }
  }
  initialize()
}
