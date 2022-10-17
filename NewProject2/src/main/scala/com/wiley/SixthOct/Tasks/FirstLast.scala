package com.wiley.SixthOct.Tasks

//Write a Scala program to find the sum of the first and last digit of a number
object FirstLast extends App{
  def toDigit(x: Int): List[Int]={
    x.toString.map(_.asDigit).toList
  }

  def firstLastSum(a: Int): Int={
    var x = toDigit(a)
    var sum = x.head + x.reverse.head
    sum
  }

  println(firstLastSum(23456))
}
