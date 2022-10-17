package com.wiley.SixthOct.Patterns

// if you only one object which state you don't want to change
object Singleton {
  def main(args:Array[String]): Unit ={
    SingletonObject.hello()
    SingletonObject.hello()
    SingletonObject.hello()
  }
}
//object itself doesn't require a keyword it can be
//just creating one instance and using it
// singleton remains in state through runtime
object SingletonObject{
  var a=1
  def hello(): Unit ={
    println("It's a Singleton\n"+a)
    a=a+2
    println(a)
  }
}
// object only get instantiated when called