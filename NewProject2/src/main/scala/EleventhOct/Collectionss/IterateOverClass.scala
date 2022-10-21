package EleventhOct.Collectionss


//instead of usign a for loop you can iterate through lists with foreach
object IterateOverClass extends App {
  var games = Set("Golf", "Football", "Tennis", "Cricket")
  games.foreach(elem => println(elem))
  //games.foreach((elem:String=> println(elem)))
  println(games)
}
