package com.wiley.SixthOct.Tasks
import scala.util.control.Breaks._

object PrimeCheck extends App{
  def primeCheck(x: Int): Boolean={
    for (w <- 2 to x / 2) {
      if (x % w == 0) {
        return false
      }
    }
    true
  }
  print("Enter a number:")
  var number: Int = scala.io.StdIn.readInt()
  var prime= primeCheck(number)
  if (prime){
    println(number+" is prime")
  }else{
    print(number+" is not prime")
  }
}
