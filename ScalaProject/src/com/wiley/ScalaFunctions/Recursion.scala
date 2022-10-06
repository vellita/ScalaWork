package com.wiley.ScalaFunctions

//05_10 part 3
object Recursion {
def main(args: Array[String]): Unit = {
  var result = factorial(5)
  println(result)
}
  def functionExample(a:Double, b:Double):Double={
    if (b==0)
      0
    else {
      a+functionExample(a,b-1)
    }
  }
  def factorial(a:Int): Int = {
    if (a == 1)
      1
    else
      a * factorial(a - 1)
  }

}
