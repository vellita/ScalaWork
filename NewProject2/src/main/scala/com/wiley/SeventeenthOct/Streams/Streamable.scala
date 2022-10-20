package com.wiley.SeventeenthOct.Streams

object Streamable extends App{

  //Stream.empty signifies the end of the stream
  val stream = 1 #:: 2#:: 8 #:: Stream.empty
  println(stream)

  stream.take(2).print()
  stream.take(3).print()

  println("\n"+ stream.map(_+2))
  println(stream.head, stream.tail)
  println(stream.max, stream.sum, stream(2))

  val emptyStream: Stream[Int] = Stream.empty[Int]
  println(s"Empty Stream = $emptyStream")

  println("\n\n")
  val bigStream = (1 to 100_000_000).toStream
  bigStream.take(30).print

  println("*********List to Stream")
  var list1 = List(10,20,30,40,50,60,70,80,90)
  var listtostream = list1.toStream

  println(listtostream)


}
