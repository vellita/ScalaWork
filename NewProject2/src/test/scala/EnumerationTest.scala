import org.scalatest.flatspec.AnyFlatSpec
import com.wiley.SeventeenthOct.Enumerations.Milkyway
class EnumerationTest extends AnyFlatSpec{
  "the milkyway enumeration" should "have jupiter as a planet" in {
    assert(Milkyway.isPlanet("Jupiter") === true)
  }

  it should "have a size of 10" in {
    assert(Milkyway.values.size === 10)
  }

}
