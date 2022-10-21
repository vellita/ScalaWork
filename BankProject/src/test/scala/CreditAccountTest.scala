import org.scalatest.BeforeAndAfter
import org.scalatest.funspec.AnyFunSpec

class CreditAccountTest extends AnyFunSpec with BeforeAndAfter{
  var creditacc = new Credit(111111,22222222, 4000)
  before{
    creditacc =  new Credit(111111,22222222, 4000)
  }

  describe("opening a credit account"){
    it("opening balance should be credit limit") {
      //var creditacc = new Credit(111111,22222222, 4000)
      assert(creditacc.getBalance() === 4000)
      assert(creditacc.overdueAmount === 0)
      creditacc.spend(386)
      creditacc.termEnd
      assert(creditacc.overdueAmount > 0)
    }

    it("should have 0 overedue amount"){
      assert(creditacc.overdueAmount === 0)
    }
    it ("should be able to spend money, balance should reduce"){
      creditacc.spend(500)
      assert(creditacc.getBalance() < 4000)
    }

    it ("at the end of a term i.e a month interest is added on money spent"){
      creditacc.spend(500)
      assert(creditacc.getBalance() < 4000)
      creditacc.termEnd
      assert(creditacc.overdueAmount > 500) //interest is added so the amount owed is greater than amount spent
    }


  }

}
