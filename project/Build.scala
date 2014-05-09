import sbt._
import sbt.Keys._
import play.{Project => PlayProject}
import scala.collection.immutable.Seq

object Build extends Build {

  import Dependencies._
  import BuildSettings._

  // -------------------------------------------------------------------------------------------------------------------
  // Root Project
  // -------------------------------------------------------------------------------------------------------------------

  lazy val root = Project("root", file("."))
    .aggregate(test, core, play)
    .settings(rootSettings: _*)

  // -------------------------------------------------------------------------------------------------------------------
  // Modules
  // -------------------------------------------------------------------------------------------------------------------

  lazy val test = Project("myapp-test", file("myapp-test"))
    .settings(moduleSettings: _*)
    .settings(libraryDependencies ++= Seq(specs2, mockito))

  lazy val core = Project("myapp-core", file("myapp-core"))
    .dependsOn(test % "test")
    .settings(moduleSettings: _*)
    .settings(libraryDependencies ++= Seq(dispatch, json4s, jodatime, jodaconvert, config, commonsLang, specs2 % "test", mockito % "test"))

  // -------------------------------------------------------------------------------------------------------------------
  // Play Module
  // -------------------------------------------------------------------------------------------------------------------

  lazy val play = PlayProject("myapp-play", path = file("myapp-play"))
    .dependsOn(core, test % "test")
    .settings(playModuleSettings: _*)
}
