import scalikejdbc._

import java.text.SimpleDateFormat
import java.util.{Calendar, Date}
import java.time.LocalDate
class Customers(id:Int, firstN:String, lastN:String, doB: String) {
  val cusid:Int = id
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
    sql"insert into customers (id, first_name, surname, DoB, username, password) values (${id}, ${first_name}, ${surname}, ${doB}, ${username}, ${password})".update.apply()
  }

}
object testCustomers extends App{
  //val format = new SimpleDateFormat("yyyy-MM-dd")
  var newuser = new Customers(3, "Laura", "JenKins", "2000-02-04")
  newuser.setPassword("password")
  newuser.addtoDB()

  println(newuser.getusername)
}