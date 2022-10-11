package com.wiley.TenthOct.Exceptions

class MoreExceptions {
  def divide(a: Int, b: Int): Unit = {
    try {
      a / b
      var arr=Array(1,2)
      arr(10)
    } catch {
      case e: ArithmeticException => println(e)
      case ex: Throwable => println("Unknown: "+ex) // we are cathing the eout of bounds index error from line 8
    }

  }
}

object ExceptionRunable extends App{
  new MoreExceptions().divide(100,0)
}