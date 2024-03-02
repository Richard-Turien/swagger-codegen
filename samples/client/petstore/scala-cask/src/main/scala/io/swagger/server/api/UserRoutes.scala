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

import io.swagger.server.model.User


final case class UserRoutes(service : UserService) extends cask.Routes {

    @cask.get("/user", true)
    def routeWorkAroundForGETUser(request: cask.Request,username : Option[String] = None, password : Option[String] = None) = {
        request.remainingPathSegments match {
            case Seq("login") => loginUser(request,username.getOrElse(""), password.getOrElse(""))
            case Seq("logout") => logoutUser(request)
            case Seq(username) => getUserByName(username,request)
        }
    }
        
        /** Create user
         * 
         */
        @cask.post("/user")
        def createUser(request: cask.Request) = {

        val serviceResponse =         for {
            
            /** TODO - this is a bit of a hack - we should do content type negotiation */
            body <- Parsed.eval(User.fromJsonString(request.bodyAsString))
            result <- Parsed.eval(service.createUser(body))
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Creates list of users with given input array
         * 
         */
        @cask.post("/user/createWithArray")
        def createUsersWithArrayInput(request: cask.Request) = {

        val serviceResponse =         for {
            
            /** TODO - this is a bit of a hack - we should do content type negotiation */
            body <- Parsed.eval(User.manyFromJsonString(request.bodyAsString))
            result <- Parsed.eval(service.createUsersWithArrayInput(body))
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Creates list of users with given input array
         * 
         */
        @cask.post("/user/createWithList")
        def createUsersWithListInput(request: cask.Request) = {

        val serviceResponse =         for {
            
            /** TODO - this is a bit of a hack - we should do content type negotiation */
            body <- Parsed.eval(User.manyFromJsonString(request.bodyAsString))
            result <- Parsed.eval(service.createUsersWithListInput(body))
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Delete user
         * 
         */
        @cask.delete("/user/:username")
        def deleteUser(username : String, request: cask.Request) = {

        val serviceResponse =         for {
            
            username <- Parsed(username)
            result <- Parsed.eval(service.deleteUser(username))
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Get user by user name
         * 
         */
        // conflicts with [/user/{username}, /user/login, /user/logout] after/user, ignoring @cask.get("/user/:username")
        def getUserByName(username : String, request: cask.Request) = {

        val serviceResponse =         for {
            
            username <- Parsed(username)
            result <- Parsed.eval(service.getUserByName(username))
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Logs user into the system
         * 
         */
        // conflicts with [/user/{username}, /user/login, /user/logout] after/user, ignoring @cask.get("/user/login")
        def loginUser(request: cask.Request, username : String, password : String) = {

        val serviceResponse =         for {
            result <- Parsed.eval(service.loginUser(username, password))
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Logs out current logged in user session
         * 
         */
        // conflicts with [/user/{username}, /user/login, /user/logout] after/user, ignoring @cask.get("/user/logout")
        def logoutUser(request: cask.Request) = {

        val serviceResponse =         for {
            result <- Parsed.eval(service.logoutUser())
        } yield result

        asHttpResponse(serviceResponse)
      }
        
        /** Updated user
         * 
         */
        @cask.put("/user/:username")
        def updateUser(username : String, request: cask.Request) = {

        val serviceResponse =         for {
            
            username <- Parsed(username)
            
            /** TODO - this is a bit of a hack - we should do content type negotiation */
            body <- Parsed.eval(User.fromJsonString(request.bodyAsString))
            result <- Parsed.eval(service.updateUser(username, body))
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
