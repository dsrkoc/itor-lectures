version := "1.0"

lazy val commonSettings = Seq(
  organization := "com.instantor",
  version      := "1.0",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
  )
)

// ----- sub-projects -----

lazy val patmat = (project in file("patmat")).
  settings(commonSettings: _*).
  settings(
    name := "patmat"
  )

lazy val `cons-list` = (project in file("cons-list")).
  settings(commonSettings: _*).
  settings(
    name := "cons-list"
  )
