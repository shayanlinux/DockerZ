name := """app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// setting a maintainer which is used for all packaging types
NativePackagerKeys.maintainer := "shayanlinux"

// exposing the play ports
NativePackagerKeys.dockerExposedPorts in Docker := Seq(9000, 9443)

// create image with: sbt docker:publishLocal
// run container with: docker run -p 9000:9000 <name>:<version>
