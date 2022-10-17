package EleventhOct.Tasks

abstract class DonutPastry {
  var name:String

  def printName()
}

class VanillaDonut extends DonutPastry {
  override var name: String = "Vanilla Donut"

  override def printName(): Unit = {
    println(name)
  }
}

class GlazedDonut extends DonutPastry {
  override var name: String = "Glazed Donut"

  override def printName(): Unit = {
    println(name)
  }
}
class DonutContainer[D <: DonutPastry](d:D) {
  def donut: D = d
  def name(): Unit={
    d.printName()
  }
}


object DonutRun extends App{
  val vanillaDonuts = new DonutContainer[VanillaDonut](new VanillaDonut)
  val glazedDonuts = new DonutContainer[GlazedDonut](new GlazedDonut)
  vanillaDonuts.name()
  glazedDonuts.name()
}