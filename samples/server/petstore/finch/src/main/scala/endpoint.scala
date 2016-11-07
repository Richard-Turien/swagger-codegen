package io.swagger.petstore

import _root_.argonaut._, Argonaut._
import com.twitter.finagle.Service
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.FileUpload
import com.twitter.util.Future
import argonaut.Argonaut._
import io.finch._, items._
import io.finch.argonaut._

/**
 * Provides the paths and endpoints for all the API's public service methods.
 */
object endpoint {

  implicit val encodeException: EncodeJson[Exception] = EncodeJson {
    case Error.NotPresent(ParamItem(p)) => Json.obj(
      "error" -> jString("param_not_present"), "param" -> jString(p)
    )
    case Error.NotPresent(BodyItem) => Json.obj(
      "error" -> jString("body_not_present")
    )
    case Error.NotParsed(ParamItem(p), _, _) => Json.obj(
      "error" -> jString("param_not_parsed"), "param" -> jString(p)
    )
    case Error.NotParsed(BodyItem, _, _) => Json.obj(
      "error" -> jString("body_not_parsed")
    )
    case Error.NotValid(ParamItem(p), rule) => Json.obj(
      "error" -> jString("param_not_valid"), "param" -> jString(p), "rule" -> jString(rule)
    )
    // Domain errors
    case error: PetstoreError => Json.obj(
      "error" -> jString(error.message)
    )
  }

  /**
  * Compiles together all the endpoints relating to public service methods.
  *
  * @return A service that contains all provided endpoints of the API.
  */
  def makeService(da: DataAccessor): Service[Request, Response] = (
          PetApi.endpoints(da)  :+:
          StoreApi.endpoints(da)  :+:
          UserApi.endpoints(da) 
  ).handle({
      case e: PetstoreError => NotFound(e)
  }).toService



}