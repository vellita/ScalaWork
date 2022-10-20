package com.wiley.NineteethOct

object ReadPassword {
  def main(args: Array[String]) {
    val standardIn = System.console()
    println("standardIn object: " + System.console())

    print("Password> ")
    val pw = System.console().readPassword()

    print("Password: ")
    pw.foreach(print) // For demonstration purposes
    println()
  }
}