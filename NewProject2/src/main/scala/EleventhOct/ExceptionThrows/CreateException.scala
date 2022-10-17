package EleventhOct.ExceptionThrows

class InvalidAgeException(s:String) extends Exception(s){
  //to override the exception message you can have the previous line as:
  // `class InvalidAgeException(s:String) extends Exception`
  // then use the line below | or you can just put `...Exception(s)`
  /*override def toString: String = super.toString + "-----"+s */
}
class CreateException{
  @throws(classOf[InvalidAgeException])
  def validate(age:Int): Unit ={
    if(age<18){
      throw new InvalidAgeException("not eligible")
    }else{
      println("Eligible")
    }
  }
}

object CreateExceptionRun extends App{
  var e=new CreateException()
  try{
    e.validate(10)
  }catch {
    case e:Exception=>println("Exception: "+e)
  }
}