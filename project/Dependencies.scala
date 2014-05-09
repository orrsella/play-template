import sbt._

object Dependencies {

  val specs2        = "org.specs2"              %% "specs2"           % "2.3.11"
  val mockito       = "org.mockito"             %  "mockito-all"      % "1.9.5"
  val dispatch      = "net.databinder.dispatch" %% "dispatch-core"    % "0.11.0"
  val json4s        = "org.json4s"              %% "json4s-native"    % "3.2.6"
  val logback       = "ch.qos.logback"          %  "logback-classic"  % "1.1.1"
  val jodatime      = "joda-time"               %  "joda-time"        % "2.3"
  val jodaconvert   = "org.joda"                %  "joda-convert"     % "1.6"
  val config        = "com.typesafe"            %  "config"           % "1.2.0"
  val commonsLang   = "org.apache.commons"      %  "commons-lang3"    % "3.3.1"
}
