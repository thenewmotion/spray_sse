name := "spray-sse"

scalaVersion := "2.11.7"

organization := "com.thenewmotion"

enablePlugins(LibPlugin)

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "typesafe releases repo" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.9",
  "io.spray" %% "spray-io" % "1.3.3",
  "io.spray" %% "spray-can" % "1.3.3",
  "io.spray" %% "spray-routing-shapeless2" % "1.3.3",
  (if (scalaVersion.value == tnm.ScalaVersion.prev) {
    "com.chuusai" % "shapeless_2.10.4" % "2.1.0"
  } else {
     "com.chuusai" %% "shapeless" % "2.1.0"
  }),
  "org.scalatest" %% "scalatest" % "2.2.4" % "test",
  "io.spray" %% "spray-testkit" % "1.3.3" % "test"
)
