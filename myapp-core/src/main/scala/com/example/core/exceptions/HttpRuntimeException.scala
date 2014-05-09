package com.example.core.exceptions

class HttpRuntimeException(
    val httpStatusCode: Int,
    message: String = null,
    cause: Throwable = null)
  extends RuntimeException(message, cause)

object HttpRuntimeException {
  def unapply(e: HttpRuntimeException): Option[Int] = Some(e.httpStatusCode)
}
