scalaVersion := "2.11.11"

crossScalaVersions := List("2.11.11", "2.12.2")

organization := "org.lyranthe"

name := "fs2-mongodb"

libraryDependencies += "org.mongodb" % "mongodb-driver-async" % "3.0.4"
libraryDependencies += "co.fs2"      %% "fs2-core"            % "0.9.5"

enablePlugins(GitVersioning)