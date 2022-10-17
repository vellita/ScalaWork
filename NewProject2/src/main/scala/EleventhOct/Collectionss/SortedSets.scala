package EleventhOct.Collectionss

import scala.collection.immutable.SortedSet
object SortedSets extends App{
  var number:SortedSet[Int]=SortedSet(2,4,22,34,72,45,8,11)
  var numbers2 = Set(76,2,21,69,3,5,7,8,9,34)
  var all = number ++ numbers2
  all.foreach(elem=>println(elem))
  println(all.getClass)
  println(number.intersect(numbers2))
  println(number.union(numbers2))

}
