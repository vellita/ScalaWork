package com.wiley.TwentiethOct.Utilities

import scala.util.{Failure, Success, Try}

object Utilities extends App {
  // way of handling exceptions without a try catch block
  def methodwhichcanthrowexception(): String = throw new RuntimeException()

  val handleExceptionString = Try(methodwhichcanthrowexception())
  val anotherStringProcess = handleExceptionString match {
    case Success(value) => s"i have optained a valid value:${value}"
    case Failure(exception) => "I have obtained failure"

  }
  println(anotherStringProcess)
}
