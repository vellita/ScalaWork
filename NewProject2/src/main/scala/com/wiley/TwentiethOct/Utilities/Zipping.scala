package com.wiley.TwentiethOct.Utilities

object Zipping extends App{
  var list1 = List(1,2,3)
  var list2 = List("A","B","C")
  var list3 = list1 zip list2
  println(list3)

}
