package com.wiley.SixthOct.Tasks

object TemperatureTask extends App{
  def tempCheck(temps: List[Int]): Boolean={
    var below0:Boolean = false
    var over100:Boolean = false
    for(t <- temps){
      if(t < 0) below0 = true
      if(t > 100) over100 = true
    }
    if (below0 && over100) true else false
  }

  var temp: List[Int] = List(-5,6,8,103)
  var temp2: List[Int] = List(5,6,8,103)
  var temp3: List[Int] = List(-5,6,8,10)
  println(tempCheck(temp))
  println(tempCheck(temp2))
  println(tempCheck(temp3))



}
