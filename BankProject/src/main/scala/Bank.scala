import scala.util.Random

/*class Bank {

  def openAccount: Unit ={
    var sc = new Random(99999)
    var ac = new Random(9999999)

  }

}*/

object BankTest extends App{




  def openAccount(ACtype:Int): Unit = {
    var sc = new Random
    var ac = new Random

    var sort_code = sc.between(100000,999999) // 6 digit sort code
    var account_number = ac.between(10000000, 99999999) // 8 digit acccount number

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