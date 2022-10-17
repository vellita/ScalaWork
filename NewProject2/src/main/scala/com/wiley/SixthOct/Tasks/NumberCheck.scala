package com.wiley.SixthOct.Tasks

object NumberCheck extends App{
  print("Enter a number:")
  var number: Int = scala.io.StdIn.readInt()
  if (number > 0 ){
    print("number is positive")
  }else {
    println("number is negative")
  }
}
