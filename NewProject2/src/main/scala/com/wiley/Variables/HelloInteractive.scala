package com.wiley.Variables

import scala.io.StdIn.readLine


object HelloInteractive extends App{
  print("Enter your first name: ")
  val firstName = readLine()
  print("Enter your last name: ")
  val lastName = readLine()

  println(s"Hello $firstName $lastName")


}
