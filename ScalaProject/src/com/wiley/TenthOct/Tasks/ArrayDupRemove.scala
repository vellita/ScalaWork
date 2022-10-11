package com.wiley.TenthOct.Tasks

class ArrayDupRemove {
  def filter(x:Array[Int]): Array[Int]={
    x.distinct

  }
}

object runarraydupremoval extends App{
  def printarr(x: Array[Int]): Unit ={
    for (elem <- x) {
      print(elem + " ")
    }
  }
  var runnable =new ArrayDupRemove()
  var arr = Array(1,2,2,3,4,6,1,3,5,2)
  println("original array length: "+arr.length)
  printarr(arr)
  var result = runnable.filter(arr)
  println("\nk="+result.length)
  printarr(result)
}