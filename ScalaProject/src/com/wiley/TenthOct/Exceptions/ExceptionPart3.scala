package com.wiley.TenthOct.Exceptions

class Exception3 {
  def divide(a: Int, b: Int): Unit = {
    try {
      a / b
      var arr = Array(1, 2)
      arr(10)
    } catch {
      case e: ArithmeticException => println(e)
      case ex: ArrayIndexOutOfBoundsException => println("index out of bounds")
      case exp:Exception => println(exp)
      case thr:Throwable => println("Unknown: "+thr)
    } finally {
      // finally will run even is exception is not handeled
      println("finally is being executed")
    }

  }
}
object ExceptionPart3 extends App {
  new Exception3().divide(123,10)
}
