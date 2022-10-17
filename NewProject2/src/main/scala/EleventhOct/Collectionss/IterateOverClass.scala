package EleventhOct.Collectionss

object IterateOverClass extends App {
  var games = Set("Golf", "Football", "Tennis", "Cricket")
  games.foreach(elem => println(elem))
  //games.foreach((elem:String=> println(elem)))
  println(games)
}
