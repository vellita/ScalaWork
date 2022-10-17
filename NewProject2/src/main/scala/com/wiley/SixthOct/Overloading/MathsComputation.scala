package com.wiley.SixthOct.Overloading

class MathsComputation {

  def add(a: Int, b: Int): Unit = {
    var sum = a + b
    println(sum)
  }

  def add(a:Int, b:Int, c:Int) ={
    var sum = a+b+c
    println(sum)
  }
  def add(a:Double, b:Double) ={
    var sum = a+b
    println(sum)
  }
}
object MathMain extends App {
  var a = new MathsComputation()
  a.add(2,3)
  a.add(1,2,3)
}
