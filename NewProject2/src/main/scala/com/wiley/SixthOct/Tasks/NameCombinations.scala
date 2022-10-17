package com.wiley.SixthOct.Tasks

// Write a program get all possible combination of your name
object NameCombinations extends App{
 /* def rearrange(name: String): Unit={

  }
*/
  def apply(text: String): Array[String] = text.permutations.toArray
 var result = apply("Davis")
 println(result.length)
 println(result.distinct.length)
  println(result.mkString(" "))

}
