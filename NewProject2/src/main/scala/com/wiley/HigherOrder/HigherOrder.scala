package com.wiley.HigherOrder

import com.wiley.ScalaFunctions.Recursion
import com.wiley.ScalaFunctions.Recursion.factorial

//05_10 part 4
object HigherOrder {
  def main(args: Array[String]): Unit = {
    higherOrder(5, factorial)
    higherOrder2(6, 3, Recursion.functionExample)
  }

  def higherOrder(a: Int, f: Int => AnyVal): Unit = {
    println(f(a)) //a higher order function is one that call another function
  }

  def higherOrder2(a: Int, b: Int, f: (Double, Double) => AnyVal): Unit = {
    println(f(a, b)) //a higher order function is one that call another function
  }

  def doubleValue(a: Int): Int = {
    a * 2
  }
}
