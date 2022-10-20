package com.wiley.TwentiethOct

object ImplicticVar extends App {
  val valu = 10
  implicit val multiplier = 5

  def multiply(implicit by:Int) = valu*by

  val result=multiply

  println(result)

}
