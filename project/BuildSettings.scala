import sbt._
import sbt.Keys._

object BuildSettings {

  private lazy val basicSettings = Seq(
    version               <<= version in ThisBuild,
    scalaVersion          :=  "2.10.4",
    organization          :=  "com.example",
    organizationHomepage  :=  Some(new URL("http://www.example.com")),
    scalacOptions         ++= Seq("-unchecked", "-deprecation", "-feature", "-Xfuture", "-Xlint"),
    incOptions            :=  incOptions.value.withNameHashing(true),
    doc in Compile        <<= target.map(_ / "none")
  )

  private lazy val noPublishing = Seq(
    publish := (),
    publishLocal := ()
  )

  private lazy val commonSettings = basicSettings ++ Release.settings

  lazy val rootSettings       = commonSettings ++ noPublishing
  lazy val moduleSettings     = commonSettings ++ noPublishing
  lazy val playModuleSettings = commonSettings ++ Publish.settings
}
