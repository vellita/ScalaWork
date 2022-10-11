package com.wiley.TenthOct

final class FinalClass {
  def drive(): Unit ={
    println("Drive")
  }
}
// cannot inherit from final
/*

class Another extends FinalClass{
  override def drive(): Unit ={
    println("drive again")
  }
}
*/
