package com.wiley.SixthOct.Constructors

class SecondaryPractice (id:Int, name:String, age:Int){
  var Defaultnum=0
  var Defaultname:String="Default"

  def showDetails(): Unit={
    println(id+" "+name+"  "+age )
  }
  def this(id:Int, name:String) = {
    this(id,name, Defaultnum)
  }

  def this(id: Int, age: Int) ={
    this(id, Defaultname, age)
  }

  def this(name: String, age: Int) ={
    this(Defaultnum, name, age)
  }
  def this() ={
    this(Defaultnum, Defaultname, Defaultnum)
  }

}

object SecondaryPrc extends App{
  var s=new SecondaryPractice(1, name="Donna", age=23)
  s.showDetails()
}