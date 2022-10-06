package com.wiley.Variables.Tasks

object Palindrone extends App{

  var word = "racecar"
  println("Please enter a string")
  var first = scala.io.StdIn.readLine()
  var end = first.length
  var Word_length = word.length-1
  for(a <- 0 to Word_length){
    if(word.charAt(a) == word.charAt(Word_length)){
      Word_length -= 1
    }
    else{
      println("Word is not a palindrome")
      break
    }
  }
  println("Word is palindrome")

}
