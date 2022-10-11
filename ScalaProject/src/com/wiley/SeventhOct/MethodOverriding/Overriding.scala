package com.wiley.SeventhOct.MethodOverriding

object Overriding extends App {
  var b = new EBike()
  b.run()

}

class Vehicle {
  def run(): Unit ={
    println("Vehicle is running")
  }
}
class Bike extends Vehicle {
  override def run(): Unit = {
    println("Bike is running")
//    super.run()
  }
}
class EBike extends Bike {
  override def run(): Unit = {
    println("E-Bike is running")
    super.run()
  }
}