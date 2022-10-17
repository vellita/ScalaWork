package com.wiley.TenthOct.Exceptions

class ThrowException {
  def validate(age: Int): Unit={
    if(age<18)
      println("You are not eligible")
    else
      println("You are eligible")
  }
}

object throwing{
  def main(args:Array[String]): Unit = {
    var e = new ThrowException
    e.validate(10)
  }

}