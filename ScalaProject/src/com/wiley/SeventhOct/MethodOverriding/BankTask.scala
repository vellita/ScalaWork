package com.wiley.SeventhOct.MethodOverriding

class Bank {
  var interest: Double = 0.5

  def rateofInterest(): Double = {
    println("Main Bank's interest is")
    interest
  }
}

class BofA extends Bank {
  override def rateofInterest(): Double = {
    println("Bank Of America interest")
    interest * 0.02
  }
}

class NatWest extends Bank {
  override def rateofInterest(): Double = {
    println("NatWest interest")
    interest * 0.15
  }
}

object overridden extends App {
  var person = new NatWest
  println(person.rateofInterest())
  var second_person = new BofA
  println(second_person.rateofInterest())
}