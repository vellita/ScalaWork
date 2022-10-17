package Collectionvectors

object vectorplay extends App{

  val set2to40 = (1 to 40).toSet
  println(set2to40)

  val setatoz = ('a' to 'z').toSet

  val arr1to100 = (1 to 100).toArray
  arr1to100.foreach(println(_))

  val seq30to50 = (30 to 50).toSeq
  seq30to50.foreach(print(_))

}
