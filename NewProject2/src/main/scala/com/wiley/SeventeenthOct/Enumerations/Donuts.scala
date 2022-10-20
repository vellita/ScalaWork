package com.wiley.SeventeenthOct.Enumerations

object Donuts extends Enumeration {
  type Donuts=Value

  val Glazed = Value("Glazed is for a")
  val Strawberry = Value("Strawberry is for z")
  val Plain = Value("Plain is for y")
  val Vanilla = Value("Vanilla is for x")


  def main(args:Array[String]): Unit ={
    println(Donuts.Vanilla)

    Donuts.values.foreach(println(_))

    Donuts.values.foreach{
      case d if(d == Donuts.Vanilla) => println(s" $d my favourite")
      case _ => println(""+_)
    }

  }
}
