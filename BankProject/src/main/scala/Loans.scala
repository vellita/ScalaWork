import scala.io.Source

class Loans {


  def getLoanRates: Unit ={
    val lines = Source.fromFile("src/main/scala/InterestRates").getLines()
    lines.map{ x =>
      val values = x.split(" ")
      (values.head.toInt, values.last.toDouble)
    }foreach(z=>
      println(s"The interest rate for loans up to ${z._1} is ${z._2}%"))
  }

  def loanEligbility(): Unit ={
    // aged betweeen 21 and 65
    // earning a salary
    // term of loan
    // credit score
    // any loans out already

  }

}
object testeee extends App{
  new Loans().getLoanRates
}


