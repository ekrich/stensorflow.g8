ThisBuild / scalaVersion := "3.2.1"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .enablePlugins(ScalaNativePlugin, ScalaNativeJUnitPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "org.ekrich" %%% "stensorflow" % "0.3.0"
    ),
    testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-s", "-v"),
    logLevel := Level.Info // Info, Debug
  )
