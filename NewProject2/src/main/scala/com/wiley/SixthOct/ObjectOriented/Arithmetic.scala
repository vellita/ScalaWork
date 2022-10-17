package com.wiley.SixthOct.ObjectOriented

//for anonymous functions
class Arithmetic {

  def add(a:Int,b:Int): Int={
    var add=a+b
    println("sum= "+add)
    add
  }
  def subtract(a: Int, b: Int): Int = {
    var sub = a - b
    println("subtraction= " + sub)
    sub
  }
  def multiply(a: Int, b: Int): Int = {
    var mult = a * b
    println("multiplication= " + mult)
    mult
  }
  def divide(a: Int, b: Int): Int = {
    var div = a / b
    println("division= " + div)
    div
  }

}

object MainObject extends App {
  new Arithmetic().add(10,10)
  new Arithmetic().subtract(10,10)
  new Arithmetic().multiply(10,10)
  new Arithmetic().divide(10,10)
}
