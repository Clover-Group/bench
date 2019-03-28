// See LICENSE for license details.
enablePlugins(JmhPlugin)

organization := "ai.clover"
name := "core"
version := "0.1.0"

scalaVersion := "2.12.8"  // This needs to match rocket-chip's scalaVersion
scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Ypartial-unification"
)

libraryDependencies ++= Seq ( 
  "org.typelevel" %% "cats-core" % "1.6.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
  "com.typesafe" % "config" % "1.3.3"
  
  )

