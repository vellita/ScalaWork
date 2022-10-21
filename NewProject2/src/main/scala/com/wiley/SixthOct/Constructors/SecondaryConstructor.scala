package com.wiley.SixthOct.Constructors


//in the main constructor we have the essential parameters
// secindary constructor allow user to pass more
// if the other parameters aren't passed thorugh a default value is used
class SecondaryConstructor (id:Int, name:String){
  var age:Int=0
  def showDetails(): Unit={
    println(id+" "+name+"  "+age)
  }
  def this(id:Int, name:String, age:Int){
    this(id,name)
    this.age=age
  }

}
object SecondaryMain extends App{
  var s=new SecondaryConstructor(1, name="Donna")
  s.showDetails()
}