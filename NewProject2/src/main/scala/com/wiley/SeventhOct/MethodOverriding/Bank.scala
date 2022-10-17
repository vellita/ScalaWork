package com.wiley.SeventhOct.MethodOverriding

class Bank1 {
  val centralBankROI=1
  def getrateofInterest(): Int ={
    centralBankROI
  }
}
class Barclays extends Bank1{
  val barclayROI = 2

  override def getrateofInterest(): Int = {
    super.getrateofInterest()+barclayROI
  }
}

object bankOperations extends App{

}