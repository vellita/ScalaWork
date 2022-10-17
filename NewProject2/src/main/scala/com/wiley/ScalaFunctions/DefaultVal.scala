package com.wiley.ScalaFunctions

object DefaultVal {
  def main(args: Array[String]): Unit = {
    val result1 = functionExample(14,23)
    val result2 = functionExample()
    val result3 = functionExample(45)
    val result4 = functionExample(b=0)
    print(result1+"\n"+result2+"\n"+result3+"\n"+result4)
  }

  def functionExample(a:Int=0, b:Int=1): Int={
    a+b
  }
}
