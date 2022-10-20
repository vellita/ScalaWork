package com.wiley.TwentiethOct

object DropWhile extends App{

  var list = List(1,2,5,7,10,13,15,14,18)
  var result=list.dropWhile(x=>{x % 3 != 0})
  var result1=list.filter(x=>{x % 3 != 0})
  println(result)

  var list2 = List(List(1,2,3), List(7,8,9))
  var result3=list2.flatten
  println(result3)

  var result5 = result.foldLeft(0)(_+_)
  println(result5)

  var result6 = result.foldRight(0)(_ + _)
  println(result6)

  val result7=List(1,2,3,4,5,6,7,8)
  val (result8,result9) = result7.partition(x=>x%3 ==0)
  println(result8)
  println(result9)

  val result10 = result7.reduce(_+_)
  println(result10)
}
