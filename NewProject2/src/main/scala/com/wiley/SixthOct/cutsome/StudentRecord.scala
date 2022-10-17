package com.wiley.SixthOct.cutsome

class StudentRecord (id:Int, name:String) {
  def getRecord(): Unit = {
    println(id + ":" + name)
  }
}
  object MainObject extends App{
    var student1 = new StudentRecord(id=101, name="Abc")
    var student2 = new StudentRecord(id=102, name="Bob")
    student1.getRecord()
    student2.getRecord()
    for (w <- 0 to 3) {
      print("Please enter your id: ")
      var id: Int = scala.io.StdIn.readInt()
      print("Please enter your name: ")
      var newname: String = scala.io.StdIn.readLine()
      var student = new StudentRecord(id = id, name = newname)
      student.getRecord()
    }

  }