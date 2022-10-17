package com.wiley.HigherOrder

//05_10 part 7
object MultiLineExpression extends App {
  println(add1(10, 20))

  def add1(i: 10, i1: 20): Int = {
    /* multiline if the + is on the seond line it is not considered hence the output would be 20
    i
    +i1
    */

    // now it will consider the +  and will output 30
    i +
      i1
  }
}
