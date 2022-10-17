import com.wiley.FourteenthOct.Objectstotest.EvenCalc
import org.scalatest.refspec.RefSpec

class EvenCalcTest extends RefSpec{
  object `EvenCalc.isEven` {
      def `should have true value`: Unit ={
        assert(EvenCalc.isEven(6) === true)
      }

    def `should have false value`: Unit = {
      assert(EvenCalc.isEven(7) === false)
    }
  }
}