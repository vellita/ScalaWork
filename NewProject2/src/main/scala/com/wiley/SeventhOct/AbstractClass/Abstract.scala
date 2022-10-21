package com.wiley.SeventhOct.AbstractClass

/*abstract classes can not be instansated but have all other functionalites of a class
* usually used when you not was an instance of the main class but of child classes
*
* abstract classes allow you to have empty variables and method */
abstract class Vehicle{
  def run()
}

class Bike extends Vehicle{
  override def run(): Unit = println("bike running")
}


object Abstract extends App{
  var bike = new Bike
  bike.run()
}
