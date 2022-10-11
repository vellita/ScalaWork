package com.wiley.TenthOct.Strings

class StringInterp {
  var s1="String interpolation example\n"
  var version=2.12

  def show(): Unit = {
    println(f"This is an $s1%s Scala version is $version%2.2f")
  }
}
object Interpolation extends App{
  new StringInterp().show()
}
