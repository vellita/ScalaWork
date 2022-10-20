package akka

import akka.actor.typed.ActorSystem
import akka.actor.typed.javadsl.Behaviors
import akka.stream.scaladsl._

import scala.concurrent.{ExecutionContext, Future}

object akkapractice extends App {
  implicit val system = ActorSystem(Behaviors.empty,"ScalaCohort")
  implicit val ec:ExecutionContext=system.executionContext

  val source=Source(1 to 10000)
  val flow=Flow[Int].map(x=> x*2)
  val sink=Sink.foreach[Int](x=>println(x))
  val firstGraph=source.via(flow).to(sink)

  val asyncFlow= Flow[Int].mapAsync(4){
    x=> Future{
      x*4
      println(x)
    }
  }
}