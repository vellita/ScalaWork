package com.wiley.TenthOct.Tasks

class Person(fName: String){
  var lName =""
  var age:Int = -1
  def this(fName:String, lName:String){
    this(fName)
    this.lName = lName
  }

  def this(fName: String, lName: String, age:Int) {
    this(fName, lName)
    this.age = age
  }

  override def toString: String = {
    f"$fName $lName aged $age"
  }
}
object ConstructorTask extends App{
  var user = new Person("Bob")
  var user1 = new Person("Peter", "Smith")
  var user2 = new Person("John","Edwards", 34)
  println(user)
  println(user1)
  println(user2)

}
