package com.wiley.SeventeenthOct.Collection.Maps

object Mapper extends App {
  var map = Map(("A", "Apple"), ("B", "Ball"))
  var map2 = Map("A" -> "Apple", "B" -> "Ball")
  var emptymap: Map[String, String] = Map.empty[String, String]
  println(map)
  print(map2)
  println(emptymap)

  println("_______")
  println(map("B"))
  map2 = map2 + ("D" -> "Dog")
  print(map2)

  map2 = map2 - ("B")
  println(map2)
}
