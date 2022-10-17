package com.wiley.TenthOct.Arrays

class ArrayExample {
  var arr1=Array(Array(1,2,3,4,5), Array(6,7,8,9,10))
  var arr2=Array(Array(11,12,13,14,15), Array(26,27,28,29,30))
  var arr3=Array.ofDim[Int](2,5)

  def add(): Unit={
    for (i <- 0 to arr1.length - 1) {
      for (j <- 0 to arr1(1).length - 1) {
        arr3(i)(j)=arr1(i)(j)+arr2(i)(j)
        print(" "+arr3(i)(j))
      }
      println("--")
    }
  }

}


object AdditionMultiDimArr  extends App{
  var a = new ArrayExample
  a.add()
}
