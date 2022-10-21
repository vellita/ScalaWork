package com.wiley.SeventeenthOct.Collection.Queue

import scala.collection.mutable.PriorityQueue

object PriQueue extends App {
  case class Donut(name: String, price: Double)

  def donutordeer(d: Donut) = d.price

  val priorityQue: PriorityQueue[Donut] = PriorityQueue(
    Donut("plain nonut", 1.50), Donut("Strawberry", 3.20), Donut("Chocolate", 2.90), Donut("Custard", 1.00))(Ordering.by(donutordeer).reverse)
  println(f"eleement of pq are $priorityQue")


  priorityQue.enqueue(Donut("Sprinkled", 2.00))

  priorityQue.foreach(println(_))

  var de: Donut = priorityQue.dequeue()
  println(de.name)

  //println(de.)

}
