package com.wiley.TwentiethOct.akka

import akka.actor.typed.ActorSystem
import akka.actor.typed.javadsl.Behaviors
import akka.stream.scaladsl.{Flow, Sink, Source}

import scala.concurrent.{ExecutionContext, Future}

object Aka {
  implicit val system = ActorSystem(Behaviors.empty, "ScalaCohort")

  val source = Source(1 to 1000)
  val flow = Flow[Int].map(x => x * 2)
  val sink = Sink.foreach[Int](x => println(x))
  val firstGraph = source.via(flow).to(sink)

  def main(args:Array[String]): Unit ={
    println("welcome")
    firstGraph.run()
  }
}