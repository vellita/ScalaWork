package com.wiley.TenthOct.Arrays

object WithinArray extends App{
  var a = new ArrayinArray
  a.show
}

class ArrayinArray{
  var arr=Array(Array(0,1,2,3,4,5), Array(6,7,8,9,10), Array(11,12,13))


  def show: Unit = {

    for (i <-0 to arr.length-1){
      for (j <- 0 to arr(i).length-1){
        print(" "+arr(i)(j))
      }
      println("")
    }
  }
}