name := """webapp"""

version := "0.0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// Test
libraryDependencies += "net.ruippeixotog" %% "scala-scraper" % "0.1.2" % "test"
// Coverage
coverageEnabled.in(Test, test) := true
coverageMinimum := 100
coverageFailOnMinimum := true
coverageExcludedPackages := "<empty>;router;me.cs.easypost.views.html"
