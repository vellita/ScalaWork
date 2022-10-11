package com.wiley.TenthOct

object Task extends App{
  var x = new ArrayManip
  x.create(4,4)
  //x.spilt()

}
class ArrayManip {
  var arr = Array.ofDim[Int](2, 2)
  var xdim = 2
  var ydim = 2



  def create(x: Int, y: Int): Unit = {
    xdim = x
    ydim = y

    arr = Array.ofDim(x, y)
    for (i <- 0 to x - 1) {
      for (j <- 0 to y - 1) {
        arr(i)(j) = i + j
      }
    }
  }

/*  def spilt(): Unit={
    var spiltarr = Array[Any](xdim)
    for (i <- 0 to xdim - 1) {
      var temparr = new Array[Int](ydim)
      for (j <- 0 to ydim - 1) {
        temparr(j) = arr(i)(j)
        //println(temparr(j))
      }
      /*for (element <- temparr) {
        println(element)
      }*/
      spiltarr(i) = temparr
    }
    //println(spiltarr(0))

    /*for (i <- 0 to spiltarr.length - 1) {
      for (j <- 0 to spiltarr(0).length - 1) {
        print(" " + arr(i)(j))
      }
      println("")
    }*/
  }*/
}