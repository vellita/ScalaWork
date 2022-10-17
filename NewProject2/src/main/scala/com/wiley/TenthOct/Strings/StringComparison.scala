package com.wiley.TenthOct.Strings

class StringComparison {
  var s1="Scala string example"
  var s2="Hello Scala"
  var s3=" Hello Scala"

  def show: Unit ={
    println(s1.compareTo(s2))
    println(s2.compareTo(s3))
    println(s3.substring(1,12))
    println(s2.compareTo(s3.substring(1)))
  }
}

object Compare extends App {
  new StringComparison().show
}
