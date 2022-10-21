package com.wiley.SeventeenthOct.Collection.Queue

import scala.collection.immutable.Queue

object Queues extends App {
  var que = Queue(1, 24, 56, 7, 3, 223, 10, 5, 2, 9)
  var que2: Queue[Int] = Queue(98, 4, 5, 7, 8, 2, 21)
  println(que)
  println(que2)

  val firstEle = que.front
  println(firstEle)

  println("****Enqueuing")
  var queEnqueue = que.enqueue(3)
  queEnqueue.foreach((element: Int) => println(element))

  println("****Dequeuing")
  var quedequeue = que.dequeue
  println(quedequeue)

  println(que.apply(4))

  println(que.sorted)

  println(que.min, que.max)
  /*  println("list as queues?")
  var listque = List(1,24,56,7,3,223,5,2,9)*/

  println(que.size)


}
