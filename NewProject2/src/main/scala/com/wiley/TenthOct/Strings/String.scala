package com.wiley.TenthOct.Strings

class String {
  var s1="Scala string example"
  var s2="Hello scala"
  var s3="Hello"
  var s4=" scala"
  // concat is a good coding practise to join strings, do not use +
  var s5= s3.concat(s4)

  def show(): Unit={
    println(s1.equals(s2))
    println(s2.equals(s5))
    println(s2 == s5)
  }
}

object Stringrunnable extends App{
  new String().show()
}