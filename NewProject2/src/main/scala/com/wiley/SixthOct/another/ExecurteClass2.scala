package com.wiley.SixthOct.another

// 06_10 part 2
object ExecurteClass2 extends App{
  var s=new Student(id=100, name="Abc")
  s.show()
}
class Student(id: Int, name: "Abc"){
  def show(): Unit ={
    println(s"$id----->$name")
  }
}
