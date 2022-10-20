package com.wiley.SeventeenthOct.Collection

import scala.collection.immutable.Queue

class TestQueue {

  def getFirstElement(x: Queue[Int]): Int = {
    x.front
  }

  def getElement(x:Queue[Int], a:Int): Int = {
    x.apply(a)
  }

  def isQueueEmpty(x: Queue[Int]): Boolean = {
    x.isEmpty
  }
}
