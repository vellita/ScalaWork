ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "NewProject2"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.14" % Test
libraryDependencies += "org.scalatest" %% "scalatest-funspec" % "3.2.14" % Test
libraryDependencies +="org.scalatest" %% "scalatest-wordspec" % "3.2.14" % Test
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5"
libraryDependencies += "mysql" % "mysql-connector-java" % "8.0.30"

libraryDependencies += "org.scalikejdbc" %% "scalikejdbc" % "4.0.0"
libraryDependencies += "com.h2database" % "h2" % "2.1.214" % Test
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.4.4" % Test
/*
val dep2="com.h2database" %% "h2" % "2.1.214" % Test
val dep3="ch.qos.logback" %% "logback-classic" % "1.4.4" % Test
libraryDependencies ++= Seq(dep2,dep3)
*/

