import com.wiley.SixthOct.ObjectOriented.Arithmetic
import org.scalatest.BeforeAndAfter
import org.scalatest.funsuite.AnyFunSuite

class ArithmeticTest extends AnyFunSuite {

  test("addition"){
    var calculator = new Arithmetic
    assert(calculator.add(4,4) === 8)
  }
  test("subtraction") {
    var calculator = new Arithmetic
    assert(calculator.subtract(12,4) === 8)
  }
  test ("multiplication") {
    var calculator = new Arithmetic
    assert(calculator.multiply(2, 4) === 8)
  }
  test ("division") {
    var calculator = new Arithmetic
    assert(calculator.divide(16, 2) === 8)
  }
}
