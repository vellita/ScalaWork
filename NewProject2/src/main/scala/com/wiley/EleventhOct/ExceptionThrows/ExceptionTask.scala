package com.wiley.EleventhOct.ExceptionThrows

class NotEvenException(s:String) extends Exception(s){}

class NotEvenTest{
  @throws(classOf[NotEvenException])
  def validate(num: Int): Unit = {
    if (num%2 != 0) {
      throw new NotEvenException(num + " is not Even")
    } else {
      println(num + "is an even number")
    }
  }
}

class PrimeException(s:String) extends Exception(s){}

class PrimeTest{
  @throws(classOf[PrimeException])
  def validate(num: Int): Unit = {
    if (num <= 1) {
      println(num + "is not a Prime number")
    } else if(num == 2 ){
      throw new PrimeException(num + " is Prime")
    }else if(!(2 to (num-1)).exists(x => num % x == 0)){
      throw new PrimeException(num + " is Prime")
    }else{
      println(num + "is not a Prime number")

    }
  }
}




object ExceptionTask extends App{
  var e = new NotEvenTest
  try {
    e.validate(5)
  } catch {
    case ex: Exception => println("Exception: " + ex)
  }
}
