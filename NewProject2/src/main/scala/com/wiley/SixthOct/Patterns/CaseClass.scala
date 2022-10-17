package com.wiley.SixthOct.Patterns

//*syntax* case class CaseClass(parameters)
// used for pattern matching etc

trait SuperTrait //the parent

case class CaseClass1(a:Int,b:Int) extends SuperTrait
case class CaseClass2(a:Int) extends SuperTrait
case object CaseObject extends SuperTrait

object CaseClass extends App {
  callCase(CaseClass1(10, 10))
  callCase(CaseClass2(10))
  callCase(CaseObject)
// expect parent as a parameter, can accept the child
  def callCase(f: SuperTrait): Unit = f match {
    case CaseClass1(f, g) => println("a=" + f + "b")
    case CaseClass2(f) => println("a=" + f)
    case CaseObject => println("No arguments in case object")

  }

}
