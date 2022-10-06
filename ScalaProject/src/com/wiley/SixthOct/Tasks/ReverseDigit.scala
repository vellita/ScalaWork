package com.wiley.SixthOct.Tasks

object ReverseDigit extends App {
  def reverseDigit(x: Int): Int = {
    var x1 = x.toString
    var x2 = x1.reverse
    x2.toInt
  }
  print(reverseDigit(123456))
}
