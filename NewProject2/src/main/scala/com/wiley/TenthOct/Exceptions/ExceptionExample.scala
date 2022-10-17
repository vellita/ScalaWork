package com.wiley.TenthOct.Exceptions

class ExceptionExample {
  def divide(a:Int, b:Int): Int={
    try{
      a/b
    }catch {
      case e: ArithmeticException => println(e)//"Divide by 0 error"
        0
    }

  }
}


object ExceptionRunnable extends App{
  new ExceptionExample().divide(234,0)
  println("rest of main method")
}