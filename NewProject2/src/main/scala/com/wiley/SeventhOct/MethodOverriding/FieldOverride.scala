package com.wiley.SeventhOct.MethodOverriding

class Vehicle1 {
  val speed:Int=60
}
class Bike1 extends Vehicle1 {
  // because you are overriding the spe you cannot use super.
  override val speed: Int = 100
  def show(): Unit ={
    println(speed)
  }
}
  object FieldOverride extends App {
    var b = new Bike1
    b.show()
}
