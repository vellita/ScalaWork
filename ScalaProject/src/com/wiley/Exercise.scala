package com.wiley

// 05_10 (part 6a) exercise from the slides on datatypes
object Exercise {
  def main(args: Array[String]): Unit = {
    println(activity1(101))
  }

  def activity1(a: Int): Boolean = {
    if (a >= 280 && a <= 320)
      true
    else
      false
  }
}
