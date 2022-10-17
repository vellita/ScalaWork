package com.wiley.SixthOct.ObjectOriented

import java.security.KeyStore.Entry

// 06_10 part 1
//calss name should always be same as the file name
//use objects initalise the class
class Student {
  var id: Int = 0
  var name: String = null
  def changeID(): Unit = {
    id +=1
  }
  def changeName(Entry:String): Unit ={
    changeID()
    name = Entry
  }
}
  object ExecuteClass extends App {
    var s = new Student()
    println(s.id+"----->"+s.name)
    s.changeID()
    s.changeID()
    s.changeName("bob")
    println(s.id+"----->"+s.name)
  }

