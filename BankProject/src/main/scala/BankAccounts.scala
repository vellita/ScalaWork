/* the bank account need a sort code and account number to access the account */
class BankAccounts(sort_code:Int, account_number: Int) {
  var balance: Double = 0

  // users are able to get their bank balance
  def getBalance(): Double = {
    balance
  }


  // money can be deposited into account, they get notfied if the amount is too large
  def deposit(amount: Double): Unit = {
    /* constraint in place, accounts are flagged if the amount if greater than 5000*/
    if (amount > 5000)
      println("**This is a large amount, bank may flag this deposit**")
    balance += amount
    println(f"Payment of £$amount into account $account_number has been sucessful\nNew balance is $balance")
  }

  // users can only withdraw money is there are suffficent fund else throws an exception
  def withdrawl(amount:Double): Unit = {
    try {
      if (amount > balance) {
        throw new InsufficentFunds("Sorry not enough money in account")
      }
    } catch {
      case e: Exception => println(e)
    }
    balance = balance - amount
    println(f"Current balance after this transaction is $balance")
  }
}
 class Current(sort_code:Int, account_number:Int) extends BankAccounts(sort_code:Int, account_number: Int) {

}

/* savign account inherits all features from the bank account class only difference is that interest is paid*/
 class Saving(sort_code:Int, account_number: Int) extends BankAccounts(sort_code:Int, account_number: Int){
  val interest= 0.15

  /*after  a term has ben completed the interest is paid to the account */
  def termCompleted: Unit = {
    var intrerestearned = balance * interest
    balance += intrerestearned
  }
}

/*When the account is opened a credit limit is set */
class Credit(sort_code:Int, account_number: Int, limit:Double) extends BankAccounts(sort_code:Int, account_number: Int){
  // the credit balance is set to the credit limit
  balance = limit
  // interest rate to pay on overdue payment
  private val interest = 1.25
  var overdue:Double = 0


  //getter methods for the interest rates which returns as a percentage
  def getInterestRate() = (interest-1)*100 +"%"
  def getLimit()= limit
  def creditRemaining=balance

  def spend(amnt: Double): Unit ={
    balance -= amnt
    println(s"You have just spend $amnt, you remaining credit is $balance")
  }

  def termEnd: Unit ={
    println(s"You have reached the end of the month.\nYou have spent £${limit-balance} this month, and you have £$overdue overdue" +
      s"\nwith interest of ${getInterestRate()}")

    var payment = limit - balance + overdue
    if (payment > 0) {
      overdue=payment * interest
      println("New overdue Payment: "+overdue)
    }
    balance = limit
  }

  def overdueAmount: Double = {
    overdue
  }

  def payoffOverdue(amount:Double): Unit ={
    overdue - amount
  }
}

  //created an excpetion for users not having enough funds in their account
class InsufficentFunds(s:String) extends Exception(s){
}

object bankAccTest extends App {
  var userSC = 123456
  var userAN = 24682468
  var ac = new BankAccounts(userSC, userAN)
  ac.deposit(2000)
  println(ac.getBalance())
  ac.deposit(3000)
  ac.withdrawl(50)
  println(ac.getBalance())

  var savingsac = new Saving(111111, 22222222)
  savingsac.deposit(1223)


}