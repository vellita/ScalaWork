import java.sql.{Connection, DriverManager}

class DatabaseConnection {
  val driver = "com.mysql.cj.jdbc.Driver"
  val url = "jdbc:mysql://localhost:3306/MySQL"
  val username = "root"
  val password = "RhulGreggs22!"
  var connection: Connection = null
  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)

    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT title, release_year FROM customer")
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
