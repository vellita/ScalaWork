package com.wiley.SixthOct.Overloading

object LazyFunction extends App{
  def multiplier(values: List[Int])={
    var result = values.map(l=> l*2)
    print(result)
    result
  }

  val numbers = List(1, 2, 3, 4, 5)

  lazy val output2 = multiplier(numbers)
  output2
}
