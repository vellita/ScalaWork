package com.wiley.SixthOct.Patterns

class CompanionClass {
  def hello(): Unit={
    println("This is a companion class")
  }
}

//class can never be a singleton
// everytime yuo invoke a new object you get a companion class

object CompanionObject extends App{
  new CompanionClass().hello()
  println("companion Object")
}