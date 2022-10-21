package EleventhOct.Collectionss

// sets is a type of collection
// this objects if just testing out the features of a set
object MoreSets extends App{
  var set1 = Set("BMW")
  var set2 = Set("Honda", "Audi", "Toyota")
  var cars: Set[String] = Set("BMW", "Vauxhall", "Volkswagen", "Tesla", "BMW", "Mercedes")
  println(set1.isEmpty)
  println(cars.isEmpty)
  println(cars.head)
  println(cars.size)
  println(cars.toList)
  println(cars.contains("BMW"))
  println(cars)
  println(cars.drop(2))
  println(cars.diff(set1))
  println(cars.find(set1))
  println(cars.concat(set2))
  println("--------")

  cars += "Ford"
  println(cars)


}
