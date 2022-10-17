package com.wiley.ScalaFunctions

//05_10 part 2
object funtionCall{
  def main(args: Array[String]): Unit = {
    functionExam
    var result= functionExample(23,45)
    println(result)
  }
  def functionExam(): Unit ={
    println("Simple func")
  }

  def functionExammod(): Int={
    var a= 25
    a
  }

  def functionExample(a:Int, b:Int): Int={
    var c=a+b
    return c
  }
}
