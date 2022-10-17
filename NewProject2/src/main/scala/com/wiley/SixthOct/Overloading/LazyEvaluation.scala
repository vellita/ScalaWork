package com.wiley.SixthOct.Overloading

object LazyEvaluation extends App {
  // when you assign lazy it won't be called until it's invoked
  lazy val myExpensiveValue=myExpensiveFunction
  var settings:Boolean = true

  if(settings){
    myExpensiveValue
  }else{
    println("go sleep")
  }

  def myExpensiveFunction(): Unit={
    println("hello")
  }
}
