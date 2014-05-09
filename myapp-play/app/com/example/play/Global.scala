package com.example.play

import com.example.core.exceptions.HttpRuntimeException
import play.api._
import play.api.http.{Status => HttpStatus}
import play.api.mvc._
import scala.concurrent.Future

object Global extends GlobalSettings with Results {

  // override def onError(request: RequestHeader, ex: Throwable) = ex.getCause match {
  //   case HttpRuntimeException(HttpStatus.NOT_FOUND)   => onHandlerNotFound(request)
  //   case HttpRuntimeException(HttpStatus.BAD_REQUEST) => onBadRequest(request, ex.getMessage)
  //   case HttpRuntimeException(status)                 => onError(request, ex, status)
  //   case _                                            => onError(request, ex, HttpStatus.INTERNAL_SERVER_ERROR)
  // }

  // private def onError(request: RequestHeader, ex: Throwable, status: Int) = {
  //   val msg = "Internal Server Error"
  //   Future.successful(new Status(status).apply(views.html.error(msg, msg, Some(ex))))
  // }

  // override def onHandlerNotFound(request: RequestHeader) = {
  //   val msg = "Page Not Found"
  //   Future.successful(NotFound(views.html.error(msg, msg)))
  // }

  // override def onBadRequest(request: RequestHeader, error: String) = {
  //   val msg = "Bad Requst"
  //   Future.successful(BadRequest(views.html.error(msg, msg)))
  // }
}
