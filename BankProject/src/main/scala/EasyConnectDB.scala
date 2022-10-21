import scalikejdbc._

class EasyConnectDB {

  def connect(): Unit ={
    Class.forName("com.mysql.cj.jdbc.Driver")
    val url = "jdbc:mysql://localhost:3306/customers"
    ConnectionPool.singleton(url, "root", "RhulGreggs22!")

    /*// ad-hoc session provider on the REPL
    implicit val session = AutoSession
    // insert initial data
    Seq("Jane", "Julie", "Jack") foreach { name =>
      sql"insert into members (name, created_at) values (${name}, current_timestamp)".update.apply()
    }*/
  }

}
object testt extends App{
  var connection = new EasyConnectDB().connect()
  implicit val session = AutoSession
  var name = "smithjane"
  val user = sql"select id from customers where username = ${name}".map(rs => rs.string("id")).list.apply()
  println(user)
  /*user match {
    case Some(i) => println(i == "word123")
  }*/

}

