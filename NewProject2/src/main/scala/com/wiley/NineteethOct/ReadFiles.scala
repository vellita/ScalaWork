package com.wiley.NineteethOct

import scala.io.Source

object ReadFiles extends App{
  var file ="C:\\Users\\velro\\Documents\\test1.txt"
  var contents = Source.fromFile(file)
  //println(Source.fromFile(file).mkString)
  Source.fromFile(file).getLines().foreach(z=>println("Line: "+z))
  println("take 2:")
  contents.getLines().take(2).foreach(println)
  println("slicing:")
  contents.getLines().slice(0,2).foreach(println)

  contents.toList
  contents.toArray


}
