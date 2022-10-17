import org.scalatest.refspec.RefSpec

class RefSpecTest extends RefSpec{
  object `A Set`{
    object `when empty`{
      def `should have size 0`: Unit ={
        assert(Set.empty.size === 0)
      }
    }
  }
}
