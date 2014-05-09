package com.example.test

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Await, Future}
import scala.language.implicitConversions

trait FutureTestingSupport {
  val timeout = 100.milli
  implicit val defaultExecutionContext: ExecutionContext = ExecutionContext.global
  implicit def futureToResult[T](future: Future[T]) = Await.result(future, timeout)
}
