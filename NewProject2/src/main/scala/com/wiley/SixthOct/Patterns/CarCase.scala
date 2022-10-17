package com.wiley.SixthOct.Patterns

trait Bird //the parent

case class RedKite(a:Int,b:Int) extends Bird
case class Sparrow(a:Int) extends Bird
case object Pigeon extends Bird

object BirdClass extends App {
  callCase(RedKite(10, 10))
  callCase(Sparrow(10))
  callCase(Pigeon)
  // expect parent as a parameter, can accept the child
  def callCase(f: Bird): Unit = f match {
    case RedKite(f, g) => println("a=" + f + "b")
    case Sparrow(f) => println("a=" + f)
    case Pigeon => println("No arguments in case object")

  }

}