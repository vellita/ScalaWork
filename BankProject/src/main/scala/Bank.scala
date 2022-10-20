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

  def accessAccountOption(): Unit = {
    println("Please enter your sort code: ")
    var sortcode = scala.io.StdIn.readInt()
    println("Please enter your account number: ")
    var accountnumber = scala.io.StdIn.readInt()

  }

  def newAccountOption(): Unit = {
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

  def helpOption(): Unit = {
    print(
      """
        |1. Find out interest rate
        |2. Provide feedback
        |
        |""".stripMargin)
    var selection = scala.io.StdIn.readInt()

    selection match {
      case 1 => Source.fromFile("src/main/scala/InterestRates").getLines().foreach(println(_))
      case 2 =>
    }
  }


  def userLogin(): Boolean = {
    println("Username:")
    val username = StdIn.readLine()

    print("Password: ")
    val pw = StdIn.readLine()

    false
  }

  def signup(): Unit ={
    println("First name:")
    val fname = StdIn.readLine()
    print("Surname: ")
    val lname = StdIn.readLine()
    print("Password: ")
    val pw = StdIn.readLine()
    println("Date of Birth(YYYY-MM-DD):")
    val doB = StdIn.readLine()

    var newuser = new Customers(1, fname, lname, doB)

    println("Your username is: "+newuser.getusername)

  }

  def main(args: Array[String]): Unit = {

    var acc1 = new Current(123456, 12345678)
    var acc2 = new Saving(111111, 22222222)
    var acc3 = new Current(246246, 13571357)
    var acc4 = new Credit(135135, 86428642, 4000)
    var acc5 = new Saving(101010, 12121212)

    var option = (-1)
    do {
      print(
        """Welcome to On-Line Bank
          |
          |1. Log in
          |2. Sign up
          |
          |0. End
          |""".stripMargin)
      option = scala.io.StdIn.readInt()

      var loggedin = false
      option match {
        case 1 => loggedin = userLogin()
        case 2 =>
      }

      if (loggedin) {
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
            case 1 => accessAccountOption()
            case 2 => newAccountOption()
            case 3 => helpOption()
            case 0 => loggedin = false
            case _ => println("not an option")
          }
        } while (selection != 0)
      }else{
        println("Login failed, try again")
      }
    }while(option != 0)
  }
}