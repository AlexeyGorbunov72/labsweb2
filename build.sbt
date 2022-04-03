name := """labsweb"""
organization := "-"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += "io.reactivex" %% "rxscala" % "0.27.0"
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "-.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "-.binders._"
