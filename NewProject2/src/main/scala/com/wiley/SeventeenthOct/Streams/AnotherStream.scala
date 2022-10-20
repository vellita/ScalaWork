package com.wiley.SeventeenthOct.Streams

import scala.collection.immutable.Stream.cons

object AnotherStream extends App{
  val stream2:Stream[Int]= cons(10,cons(1000,Stream.empty))
  println(s"Elements of stream $stream2")
}
