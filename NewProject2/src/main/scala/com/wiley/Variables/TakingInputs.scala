package com.wiley.Variables

import scala.io.StdIn.readLine
object TakingInputs extends App{
  println("Welcome!")
  println("Please enter your name: ")
  var name: String = scala.io.StdIn.readLine()
  println("Please enter yuor age: ")
  var age: Int = scala.io.StdIn.readInt

  println(s"hi $name, you are $age!")


}
