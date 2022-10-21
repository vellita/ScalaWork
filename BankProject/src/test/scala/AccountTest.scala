import org.scalatest.flatspec.AnyFlatSpec

class AccountTest extends AnyFlatSpec{
  "new account" should "have no money" in {
    var newacc =  new Current(123456,12345678)
    assert(newacc.getBalance() === 0)
  }

  "depoiting money into account" should "be able to withdraw" in {
    var newacc = new Current(123456, 12345678)
    newacc.deposit(1000)
    assert(newacc.getBalance() === 1000)
    newacc.withdrawl(20)
    assert(newacc.getBalance() === 980)
  }




}
