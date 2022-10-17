package com.wiley.SeventhOct.Inheritance

//trait similar to interface in java
// if we did 'class A' and didn't put 'with A' on class C then it would be multilevel inheritace
// this code multiple inheritance
trait A {
  var salary1=10000
}
class B extends A{
  var salary2=20000
}

class C extends B with A{
  def show(): Unit ={
    println("salary1="+salary1)
    println("salary2="+salary2)
  }
}

object Multilevel extends App {
var c= new C
c.show()
}
