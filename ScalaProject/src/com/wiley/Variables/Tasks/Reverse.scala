package com.wiley.Variables.Tasks

object Reverse extends App{

  //print("hello".reverse)
  var word: String = "Hello"
  var reverse: String = ""

  for (a <- word.length to 1 by -1) {
    reverse = reverse + word.charAt(a - 1)
  }
  println(reverse)


}
