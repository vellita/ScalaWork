package com.wiley.SeventeenthOct.Enumerations

object Milkyway extends Enumeration {
  type Planets = Value
  val Mercury,Venus,Earth,Mars,Jupiter, Saturn, Uranus,Neptune= Value

  val Pulto = Value(9,"Pluto")
  val Zoto = Value(10,"Zoto")

  def isMilkyWay(planets: Planets): Unit ={
    println(s"Planet ${planets.id} and $planets")
  }
  def isPlanet(planet:String): Boolean ={
    val check = Milkyway.values.toList.map(v=>v.toString).contains(planet)
    println(s"Planet $planet belongs to milky way is $check")
    check
  }

  def main(args: Array[String]): Unit ={
    println(s"the se of the value of type planets that milkyway holds ${Milkyway.values}")

    isMilkyWay(Milkyway.Earth)
    isMilkyWay(Milkyway.Mars)
    isPlanet("Mars")
  }
}
