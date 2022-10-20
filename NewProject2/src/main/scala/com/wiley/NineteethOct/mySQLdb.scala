package com.wiley.NineteethOct

import java.sql.{Connection, DriverManager, PreparedStatement}
import scala.io.StdIn

class mySQLdb {
  private val driver = "com.mysql.cj.jdbc.Driver"
  private val url = "jdbc:mysql://localhost:3306/MySQL"
  private val username = "root"
  private val password = "RhulGreggs22!"
  private var connection: Connection = null

  def readfromDB: Unit ={
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)

      val statement = connection.createStatement()
      val resultSet = statement.executeQuery("SELECT title, release_year FROM movies.movies")

      while (resultSet.next()) {
        val title = resultSet.getString("title")
        val releases = resultSet.getString("release_year")
        println(s"The movie $title was released in $releases")
      }
    } catch {
      case e: Exception => e.printStackTrace
    } finally {

      connection.close
    }
  }

  def insertintoDB(title:String, genre:String, director:String, release_year:Int): Unit ={
    try {
      Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val insertSql =
        """
          |insert into movies.movies (title, genre, director, release_year)
          |values (?,?,?,?)
      """.stripMargin

      val preparedStmt: PreparedStatement = connection.prepareStatement(insertSql)

      preparedStmt.setString(1, title)
      preparedStmt.setString(2, genre)
      preparedStmt.setString(3, director)
      preparedStmt.setInt(4, release_year)
      preparedStmt.execute

      preparedStmt.close()
    } catch {
      case e: Exception => e.printStackTrace
    } finally {

      connection.close
    }
  }


}


object testmySQl extends App{
  var tester = new mySQLdb
  print("How many movies would you like to enter:")
  var number = StdIn.readInt()
  for (x<- 1 to number){
    print("The Movie database, enter details of a new movie \nTitle: ")
    var newtitle = StdIn.readLine()
    print("Genre: ")
    var newgenre = StdIn.readLine()
    print("Director: ")
    var newdirect = StdIn.readLine()
    print("Release year: ")
    var newyear = StdIn.readInt()
    tester.insertintoDB(newtitle,newgenre,newdirect,newyear)
  }
  println("----------------")
  tester.readfromDB
}
