package sample

import org.scalatest.funspec.AnyFunSpec

class MathsUtilsSpec extends AnyFunSpec{
  describe("MathsUtils::double"){
    it("should handle 0 as input"){
      val result = MathsUtils.double(0)
      assert(result == 0)
    }
    it("should handle 1") {
      val result = MathsUtils.double(1)
      assert(result == 2)
    }
    it("should handle really large integers") (pending)
  }
}
