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

  lazy val rootSettings       = basicSettings
  lazy val moduleSettings     = basicSettings
  lazy val playModuleSettings = basicSettings
}
