package com.wiley.HigherOrder

//05_10 part 5
object ScalaComposition {
  def main(args: Array[String]): Unit = {
    var result = HigherOrder.doubleValue(add(2))
    println(result)
  }

  def add(a: Int): Int = {
    a + a
  }
}
