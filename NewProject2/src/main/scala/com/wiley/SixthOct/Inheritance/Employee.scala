package com.wiley.SixthOct.Inheritance

object BasicInheritance extends App{

}
class Employee {
  var salary:Float = 50000
}

class Programmer extends Employee{
  var bonus:Int=5000
  salary=8000
  println(salary)
  println(bonus)
}