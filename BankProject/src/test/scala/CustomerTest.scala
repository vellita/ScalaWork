import org.scalatest.funsuite.AnyFunSuite

class CustomerTest extends AnyFunSuite{

  test("creating a customer get a username"){
    var user = new Customers("Casper", "Celine", "2000-01-01")
    assert(user.getusername == "celinecasper")
  }

  test("when added to the database a customer id if generated"){
    var user = new Customers("Casper", "Celine", "2000-01-01")
    user.setPassword("test123")
    assert(user.getId == (-1))
    user.addtoDB()
    assert(user.getId > 0)
  }
}
