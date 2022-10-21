package com.wiley.SixthOct.Constructors

//constructors can have parameters
class PrimaryConstructor(i:Int, name:String){

  def showDetails(): Unit={
    println(i+" "+name)
  }
}

object temp extends App{
// when an instance is created the parameter values have to be passed in
  var s=new PrimaryConstructor(1, name="Donna")
  s.showDetails()
}