package com.wiley.TenthOct.Arrays

object MultiDimensional extends App{
  var a = new MultiArray
  a.create(5,6)
  a.show
}

class MultiArray{
  var arr=Array.ofDim[Int](2,2)
  var xdim = 2
  var ydim = 2


  def create(x: Int, y: Int): Unit = {
    xdim = x
    ydim = y

    arr = Array.ofDim(x, y)
    for (i <- 0 until  x-1) {
      for (j <- 0 until y-1) {
        arr(i)(j) = i+j
      }
    }
  }

  def show: Unit = {

    for (i <-0 until xdim-1){
      for (j <- 0 until ydim-1){
        print(" "+arr(i)(j))
      }
      println("")
    }
    println("third element is "+arr(1)(1))
  }
}