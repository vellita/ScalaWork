package com.wiley.HigherOrder

//05_10 part 6
object AnonymousFunction extends App {

  //using variables as functions
  var result1 = (a: Int, b: Int) => a + b
  println(result1(10, 10))

  var result2 = (_: Double) + (_: Int)
  println(result2(10, 10))


}
