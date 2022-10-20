package com.wiley.SeventeenthOct.Collection

import scala.collection.immutable.HashMap

object IterateOverMap extends App{
 var hashMap = HashMap("A"->"Apple", "B"->"Ball", "C"->"Cat")
 hashMap.foreach{
   case(key,value)=> println(key+"-->"+value)
 }
  println(hashMap("B"))
  hashMap=hashMap+("D"->"Dog")
  hashMap.foreach {
    case (key, value) => println(key + "-->" + value)
  }

  println("_------------------------")
  var s1 = Set(2,5,4,6,7,3,8)
  var results=s1.map(x=>x*x)
  println(results)

  var s2 = Set("acb", "aaaa", "bba")
  var result2 = s2.map(_.toUpperCase())
  println(result2)

}
