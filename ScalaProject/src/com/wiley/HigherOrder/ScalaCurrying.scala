package com.wiley.HigherOrder

//05_10 part 8
object ScalaCurrying extends App {
  val result = add(10)(10)
  println(result)
  val addlt = add(10) _ //currying function, it waits for the second parameter
  val result2 = addlt(3)
  println(result2)

  def add(a: Int)(b: Int): Int = {
    a + b
  }
}
