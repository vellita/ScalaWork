package com.wiley.TenthOct.Exceptions

class ExceptionTask {
  def run(): Unit = {
    try {
      var arr = Array(1, 2)
      arr(10)
    } catch {
          // all three of the cases below will throw an exception for the out of bounds error above
          // it uses the first case that applies to it; hence the order matters
      case thr: Throwable => println("Unknown: " + thr)
      case ex: ArrayIndexOutOfBoundsException => println("index out of bounds")
      case exp: Exception => println("exp: " + exp)
    } finally {
      // finally will run even is exception is not handeled
      println("Execute final statement")
    }
  }
}
object RunExceptionTask extends App{
  new ExceptionTask().run()
}
