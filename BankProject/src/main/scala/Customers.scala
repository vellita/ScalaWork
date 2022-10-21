import scalikejdbc._

import java.text.SimpleDateFormat

class Customers(firstN:String, lastN:String, doB: String) {
  var cusid:Int =  (-1)
  var first_name = firstN
  var surname = lastN
  val format = new SimpleDateFormat("yyyy-MM-dd")
  var dateofBirth = format.parse(doB)

  var username = (surname + first_name).replaceAll("\\s","").toLowerCase()
  var password = ""

  def getusername = username

  def setPassword(x:String) = password=x

  def addtoDB(): Unit ={
    var db = new EasyConnectDB
    db.connect()
    implicit val session = AutoSession
    // insert initial data
    sql"insert into customers (first_name, surname, DoB, username, password) values (${first_name}, ${surname}, ${doB}, ${username}, ${password})".update.apply()

    val id = sql"select id from customers where username = ${username}".map(rs => rs.string("id")).list.apply()
    cusid = id.head.toInt
  }

  def getId = cusid



}
object testCustomers extends App{
  //val format = new SimpleDateFormat("yyyy-MM-dd")
  var newuser = new Customers("Laura", "JenKins", "2000-02-04")
  newuser.setPassword("password")
  newuser.addtoDB()

  println(newuser.getusername)
}