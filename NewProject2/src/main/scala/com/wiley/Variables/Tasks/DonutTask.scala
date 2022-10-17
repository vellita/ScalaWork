package com.wiley.Variables.Tasks

object DonutTask extends App{
  print("{\n\"donut_name\":\"Vanilla Donut\",\n\"quantity_purchased\":\"10\",\n\"price\":2.5\n}\n")

  print("How many donuts would you like: ")
  var quantity: Int = scala.io.StdIn.readInt

  var cost = quantity*2.5

  println(f"The cost of $quantity Glazed Donuts are $$ $cost%1.2f")

}
