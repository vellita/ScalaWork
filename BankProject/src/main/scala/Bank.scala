import scala.util.Random

/*class Bank {

  def openAccount: Unit ={
    var sc = new Random(99999)
    var ac = new Random(9999999)

  }

}*/

object BankTest extends App{

  


  def openAccount(ACtype:Int): Unit = {
    var sc = new Random(99999)
    var ac = new Random(9999999)

    var sort_code = 654321 + sc.nextInt()
    var account_number = 12121212 + ac.nextInt()

    ACtype match {
      case 1 => new Current(sort_code, account_number)
      case 2 => new Saving(sort_code, account_number)
      case 3 => new Credit(sort_code, account_number, 5000)

    }

  }

  def transfer(from:BankAccounts, to:BankAccounts, amnt:Double): Unit ={
    from.withdrawl(amnt)
    to.deposit(amnt)
  }
}