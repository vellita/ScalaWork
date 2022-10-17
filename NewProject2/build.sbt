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
