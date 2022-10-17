package com.wiley.SeventhOct.FinalValues

class Vehicle {
  // final values can never be changed
  final val speed:Int=60

  //can also override methods
  final def print(): Unit={
    println("FInal print method")
  }
}
class Bike extends Vehicle {
  /*override val speed:Int=100*/
}

object FinalTest extends App{

}