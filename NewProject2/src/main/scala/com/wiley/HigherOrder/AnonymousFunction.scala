package com.wiley.HigherOrder

//05_10 part 6
//anonymous objects have no attributes
class Anonymous {
  def repeat(x:Int): Unit ={
    println(x)
  }
}

object AnonymousFunction extends App {

  // can call as class's method without assigning it to a variable
  new Anonymous().repeat(23)


  //using variables as functions
  var result1 = (a: Int, b: Int) => a + b
  println(result1(10, 10))

  var result2 = (_: Double) + (_: Int)
  println(result2(10, 10))


}
