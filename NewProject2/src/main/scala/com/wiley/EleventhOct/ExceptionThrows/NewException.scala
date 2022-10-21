package com.wiley.EleventhOct.ExceptionThrows

class NewException {
  @throws(classOf[NumberFormatException])
  def validate(): Int={
    "abc".toInt
  }
}

object NewExceptionRun extends App{
  var e = new NewException()
  try{
    e.validate()
  }catch {
    case ex:NumberFormatException=> println("Number format issue")
  }
  println("rest of the code")
}
