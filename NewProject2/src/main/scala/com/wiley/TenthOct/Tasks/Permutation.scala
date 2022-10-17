package com.wiley.TenthOct.Tasks

class Permutation {
  var arr = Array((1,2,3), (1,3,2), (2, 1, 3), (2, 3, 1), (3,1,2), (3,2,1))

 /* for (elem <- arr) {
    print(elem + " ")
  }*/

  def permutations(x: (Int,Int,Int)): Unit={

  }

  def findNext(x: (Int,Int,Int)): Any ={
    for (i <- arr.indices) {
      if (arr(i) == x)
        print(arr(i+1))
    }
  }

}

object runPermutation extends App{
  var permuta = new Permutation()
  permuta.findNext((2,1,3))

}