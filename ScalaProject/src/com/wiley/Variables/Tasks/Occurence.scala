package com.wiley.Variables.Tasks

object Occurence extends App{
  print("please enter a word :")
  var word = scala.io.StdIn.readLine()
  print("enter a char you want to check the occurence of:")
  var char = scala.io.StdIn.readChar()

  var Occurences:Int = word.count(_ == char)
  println(s"Occurences of \'${char}\' in \"$word\" is $Occurences ")



}
