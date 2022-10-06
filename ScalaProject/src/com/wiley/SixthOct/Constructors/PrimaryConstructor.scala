package com.wiley.SixthOct.Constructors

class PrimaryConstructor(i:Int, name:String){

  def showDetails(): Unit={
    println(i+" "+name)
  }
}

object temp extends App{
  var s=new PrimaryConstructor(1, name="Donna")
  s.showDetails()
}