package com.wiley.Variables

object StringLiteral extends App {
  print("\"hello\" \b \t check this out\n let's \f see  how this works\" and \' \\")
  print("carriage \r return \n\n")


  print("This is a test\"\n   \"He said, \\\"SQL is for database!\\\"\" \n   \"First\\tSecond")
  print(
    """
      |"This is a\ntest"
      |   "He said, \"SQL is for database!\""
      |   "First\tSecond"
      |""".stripMargin)
}
