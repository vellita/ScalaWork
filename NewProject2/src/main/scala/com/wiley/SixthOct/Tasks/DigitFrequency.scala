package com.wiley.SixthOct.Tasks

//Write a Scala program to find the frequency of each digit in each integer.
object DigitFrequency {
  print("please enter a word :")
  var number = scala.io.StdIn.readLine()
  print("enter a char you want to check the occurence of:")
  var digit = scala.io.StdIn.readChar()

  var Occurences: Int = number.count(_ == digit)
  println(s"Occurences of \'${digit}\' in \"$number\" is $Occurences ")
  def digitFrequency(number: Int): Unit ={
    var digits = number.toString.toList.distinct


  }
}
