package com.wiley.TenthOct

class Temp{

  //private: only used within class
  private[this] def isTemp= true
  private var hot:Int = 37

  //protected: accessed wiht class and inherited class
  protected var changedTemp =30
  def getTemp:Unit={
    return isTemp
  }
}

class MoreTemp extends Temp{

  // we can access the protected varible but not the private variable from parent class
  changedTemp = 27

}

object accessmodifier {
  var temperatures = new Temp()
