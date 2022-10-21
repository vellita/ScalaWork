package com.wiley.TwentiethOct.akka

/*
import akka.actor.typed.ActorSystem
import akka.actor.typed.javadsl.Behaviors
import akka.stream.scaladsl.{Flow, Sink, Source}

import scala.concurrent.{ExecutionContext, Future}

object akkapractice2 {
  implicit val system=ActorSystem(Behaviors.empty,"ScalaCohort")
  implicit val ec:ExecutionContext=system.executionContext

  val source=Source(1 to 10000)
  val flow=Flow[Int].map(x=> x*5)
  val sink=Sink.foreach[Int](x=> println(x))
  val firtGraph=source.via(flow).to(sink)

  val aysncFlow=Flow[Int].mapAsync(4){
    x=> Future{
      x * 4
    }
  }

  def main(args: Array[String]): Unit = {
    println("Welcome to akka world")
    firtGraph.run()
    source.via(aysncFlow).to(sink).run()
  }

}*/
