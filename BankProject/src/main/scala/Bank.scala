import scalikejdbc._

import java.io.{BufferedWriter, File, FileWriter}
import scala.io.{Source, StdIn}
import scala.util.Random

object Bank {

  def openAccount(ACtype: Int, limit: Double = 0): Unit = {
    var sc = new Random
    var ac = new Random

    var sort_code = sc.between(100000, 999999) // 6 digit sort code
    var account_number = ac.between(10000000, 99999999) // 8 digit acccount number

    ACtype match {
      case 1 => new Current(sort_code, account_number)
      case 2 => new Saving(sort_code, account_number)
      case 3 => new Credit(sort_code, account_number, limit)
    }
  }

  def transfer(from: BankAccounts, to: BankAccounts, amnt: Double): Unit = {
    from.withdrawl(amnt)
    to.deposit(amnt)
  }

  def accessAccountOption(id:Int): Unit = {
    println("Please enter your sort code: ")
    var sortcode = scala.io.StdIn.readInt()
    println("Please enter your account number: ")
    var accountnumber = scala.io.StdIn.readInt()

  }

  // the customer are able to create  differnet types of accounts
  def newAccountOption(id: Int): Unit = {
    print(
      """Please select the type of account you would like to open
        |
        |1. Current Account
        |2. Saving Account
        |3. Credit Account
        |
        |""".stripMargin)
    var selection = scala.io.StdIn.readInt()

    selection match {
      case 1 => openAccount(1)
      case 2 => openAccount(2)
      case 3 => {
        println("what would you like you limit to be: ")
        var value = scala.io.StdIn.readDouble()
        openAccount(3, value)
      }
    }
  }

  //help options created to use files
  // interest rate read from a file from the repo
  // feedback writes to a file store in the repo
  def helpOption(id:Int): Unit = {
    print(
      """
        |1. Find out interest rate
        |2. Provide feedback
        |
        |""".stripMargin)
    var selection = scala.io.StdIn.readInt()

    selection match {
      case 1 => Source.fromFile("src/main/scala/InterestRates").getLines().foreach(println(_))
      case 2 =>{
        println("Please provide feedback: ")
        var feedback = StdIn.readLine()
        //feedback is written to a file and stored, details how the wrtieFile function works is below
        writeFile(feedback, id)
      }
    }
  }

  //this take the user's feedback and store is in its own file
  // each customer they writes feedback is stored in a seperate file called feedbackX where X is their customer id
  def writeFile(s: String, cusid:Int): Unit = {
    val file = new File(s"src/main/scala/feedback/Feedback$cusid")
    val bw = new BufferedWriter(new FileWriter(file, true))
    bw.write(s+"\n----------\n")
    bw.close()
  }


  def userLogin(): Int = {
    println("Username:")
    val username = StdIn.readLine()

    print("Password: ")
    val pw = StdIn.readLine()

    var connection = new EasyConnectDB().connect()
    implicit val session = AutoSession
    val user = sql"select password from customers where username = ${username}".map(rs => rs.string("password")).first.apply()
    val id = sql"select id from customers where username = ${username}".map(rs => rs.string("id")).list.apply()
    var cusid = id.head.toInt
    user match {
      case Some(i) => if (i == pw) cusid else -1
      case _ => -1
    }
  }

  //customer sign up they enter thier details and a username is created for them
  def signup(): Int = {
    println("First name:")
    val fname = StdIn.readLine()
    print("Surname: ")
    val lname = StdIn.readLine()
    print("Password: ")
    val pw = StdIn.readLine()
    println("Date of Birth(YYYY-MM-DD):")
    val doB = StdIn.readLine()

    var newuser = new Customers(fname, lname, doB)

    //the generated username is displayed to the customer before continuing
    println("Your username is: " + newuser.getusername)
    println("Keep this safe, you need it for future login")
    Thread.sleep(2000)
    newuser.cusid
  }

  def main(args: Array[String]): Unit = {

    var acc1 = new Current(123456, 12345678)
    var acc2 = new Saving(111111, 22222222)
    var acc3 = new Current(246246, 13571357)
    var acc4 = new Credit(135135, 86428642, 4000)
    var acc5 = new Saving(101010, 12121212)

    var userid: Int = 0
    var option = (-1)
    do {
      print(
        """1. Log in
          |2. Sign up
          |
          |0. End
          |""".stripMargin)
      option = scala.io.StdIn.readInt()


      option match {
        case 1 => userid = userLogin()
        case 2 => userid = signup()
        case 0 =>
      }


      if (userid > 0) {
        var selection: Int = (-1)
        do {
          print(
            """Welcome to On-Line Bank
              |
              |1. Access existing account
              |2. Open new account
              |3. Help
              |
              |0. log out
              |
              |""".stripMargin)
          selection = scala.io.StdIn.readInt()

          selection match {
            case 1 => accessAccountOption(userid)
            case 2 => newAccountOption(userid)
            case 3 => helpOption(userid)
            case 0 => userid = -1
            case _ => println("not an option")
          }
        } while (selection != 0)
      }else{
        println("Login failed, try again")
      }
    }while(option != 0)
  }
}