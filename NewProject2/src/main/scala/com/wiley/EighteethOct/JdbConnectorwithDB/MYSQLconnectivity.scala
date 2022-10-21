package com.wiley.EighteethOct.JdbConnectorwithDB

import java.sql.{Connection, DriverManager, PreparedStatement}

object MYSQLconnectivity extends App{

  val driver="com.mysql.cj.jdbc.Driver"
  val url="jdbc:mysql://localhost:3306/MySQL"
  val username = "root"
  val password = "RhulGreggs22!"
  var connection: Connection = null
  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)

    // my own work below after doing some research, which he showed and explain to us the next day
/*    val insertSql =
      """
        |insert into movies.movies (title, genre, director, release_year)
        |values (?,?,?,?)
    """.stripMargin

    val preparedStmt: PreparedStatement = connection.prepareStatement(insertSql)

    preparedStmt.setString(1, "The Avengers")
    preparedStmt.setString(2, "Action")
    preparedStmt.setString(3, "Joss Whedon")
    preparedStmt.setInt(4, 2012)
    preparedStmt.execute

    preparedStmt.close()*/

    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT title, release_year FROM movies.movies")

    while (resultSet.next()) {
      val title = resultSet.getString("title")
      val releases = resultSet.getString("release_year")
      println(s"The movie $title was released in $releases")
    }
  } catch {
    case e: Exception => e.printStackTrace
  }finally {

    connection.close
  }

}
