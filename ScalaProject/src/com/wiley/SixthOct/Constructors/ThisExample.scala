package com.wiley.SixthOct.Constructors

class ThisExample(name:String) {
  var id:Int=0
  // var name:String=""
  def this(name:String,id:Int){
    this(name)
    this.id=id
  }
  def show(): Unit ={
    println(id+" "+name)
  }
}
object T extends App{
  var t=new ThisExample("djfhskjfhksjhfd",78)
  t.id=23
  t.show()
}
