# [JDBC Connector](https://github.com/vellita/ScalaWork/tree/master/NewProject2/src/main/scala/com/wiley/EighteethOct/JdbConnectorwithDB)

Use of java.sql to connect to my local mySQL database.
This class allows us to read from the database tables by using DriveManager
and Connection

Require a mysql java dependency

libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.30"

---

---
# [Tuples](https://github.com/vellita/ScalaWork/tree/master/NewProject2/src/main/scala/com/wiley/EighteethOct/Tuples)

In scala tuples can contain elements of different datatypes
but is not a collection as it does not inherit from a collection class ot trait.
pattern matching can be used to identify each type of the tuple.

Tuple can have a maximum of 22 items

To access an element tuples use _i eg tuple._1

---

---
# [Sets](https://github.com/vellita/ScalaWork/tree/master/NewProject2/src/main/scala/com/wiley/EleventhOct/Collectionss)

Sets are collection of unique elements with the same type. This means that there cannot be duplicate elements

Scala offer two classes of sets mutable and immutable, we focus on using mutable as immutable means we won't be able to change the state


The use of SortedSet reordered the set in a sorted order which is immutable; closed mutable option is java's treeset.
LinkedHashSet retrieves the order that its were inserted

Set interface implemented by the HashSet class using a hash table to store elements hashcodes hence the order changes

---

---

# [Exceptions](https://github.com/vellita/ScalaWork/tree/master/NewProject2/src/main/scala/com/wiley/EleventhOct/ExceptionThrows)
![](Exception-in-java1.png)

Exception and Errors are both subclasses of throwables.
Errors are illegal operations or may be due to a lack of system resources i.e caused by the environemnt.
These errors cannot be caught or handled 

An Exception is an event which occurs during the execution of a program that stops the flow of program instructions.
In scala all exceptions are unchecked, they do not have checked exception but provide flexibility
in the ability to choose whether to catch an exception. When an exception occurs, the system looks for an exception handler,
if none the program terminates.

Exception handling can be done through a try/catch block and pattern match the thrown exception.

*Throw* keyword is used to explicitly throw exceptions from methods.
It has a return type of Nothing hence is easily customisable.

---

---

# [Testing](https://github.com/vellita/ScalaWork/tree/master/NewProject2/src/test/scala)

Test cases are a professional way to write you code check the functionality and resolve bugs in the code.

Some dependency we used:

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test

This dependency provides us with various different styles of testing.
the style dictates how the declaration of the tests wil look 
but all the test case will work in the exact same way.


[AnyFunSuite](https://github.com/vellita/ScalaWork/blob/master/NewProject2/src/test/scala/Featurespec.scala)

[AnyFeatureSpec](https://github.com/vellita/ScalaWork/blob/master/NewProject2/src/test/scala/Featurespec.scala)

[AnyFlatSpec](https://github.com/vellita/ScalaWork/blob/master/NewProject2/src/test/scala/SpecsTest.scala)

[AnyFunSpec](https://github.com/vellita/ScalaWork/blob/master/NewProject2/src/test/scala/FunSpecsTest.scala)

[RefSpec](https://github.com/vellita/ScalaWork/blob/master/NewProject2/src/test/scala/RefSpecTest.scala)

[AnyWordSpec](https://github.com/vellita/ScalaWork/blob/master/NewProject2/src/test/scala/WordSpecs.scala)


---
[BeforeandAfter](https://github.com/vellita/ScalaWork/blob/master/NewProject2/src/test/scala/Example2.scala)

[GivenWhenThen](https://github.com/vellita/ScalaWork/blob/master/NewProject2/src/test/scala/Featurespec.scala)

---

--------

# [Higher Order](https://github.com/vellita/ScalaWork/tree/master/NewProject2/src/main/scala/com/wiley/HigherOrder)

Function that takes a function as an argument, or returns a function

We created from programs to implement higher order functions. 
Higher order functions can be used anonymously, as class's method can be called without assigning it to a variable 
Another use of higher order functions was multiline expression whereby the position of the operator matters.
Nested function whereby a function is called inside another.
We used it to create composite functions whereby they are stacked together.

---

---
# [Threads](https://github.com/vellita/ScalaWork/tree/master/NewProject2/src/main/scala/com/wiley/NineteethOct/Threads) 

Multithreading allows multiple processes to run at the same times to allow simultaneous performance of operations.

threads can be created in two distinct ways: by extending Thread or implementing the Runnable interface 




























