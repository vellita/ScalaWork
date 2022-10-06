package com.wiley.SixthOct.ObjectOriented

//for anonymous functions
class Arithmetic {

  def add(a:Int,b:Int): Unit={
    var add=a+b
    println("sum= "+add)
  }
  def subtract(a: Int, b: Int): Unit = {
    var sub = a - b
    println("subtraction= " + sub)
  }
  def multiply(a: Int, b: Int): Unit = {
    var mult = a * b
    println("multiplication= " + mult)
  }
  def divide(a: Int, b: Int): Unit = {
    var div = a / b
    println("division= " + div)
  }

}

object MainObject extends App {
  new Arithmetic().add(10,10)
  new Arithmetic().subtract(10,10)
  new Arithmetic().multiply(10,10)
  new Arithmetic().divide(10,10)
}
