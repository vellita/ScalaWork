package com.wiley.Variables.Tasks

object Concatenate extends App{
  print("please enter a prefix and then enter a verb \n Prefix:")
  var prefix = scala.io.StdIn.readLine()
  print("Verb:")
  var word = scala.io.StdIn.readLine()

  println(prefix + word)

}
