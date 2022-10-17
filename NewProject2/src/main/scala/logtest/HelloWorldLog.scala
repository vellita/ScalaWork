package logtest

import com.typesafe.scalalogging.LazyLogging

object HelloWorldLog extends App  with LazyLogging{
  logger.error("Hello world")
}
