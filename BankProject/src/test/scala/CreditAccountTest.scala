import org.scalatest.funspec.AnyFunSpec

class CreditAccountTest extends AnyFunSpec{
  describe("opening a credit account"){
    it("opening balance should be credit limit") {
      var creditacc = new Credit(111111,22222222, 4000)
      assert(creditacc.getBalance() === 4000)
      assert(creditacc.overdueAmount === 0)
      creditacc.spend(386)
      creditacc.termEnd
      assert(creditacc.overdueAmount > 0)

    }
  }

}
