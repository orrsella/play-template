// Comment to get more information during initialization
logLevel := Level.Warn

resolvers += "typesafe-releases" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.3")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.3")
