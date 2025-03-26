import Dependencies.*

name := "zio-connectors"
organization := "uk.org.aeb"
version := "0.1.0"
versionScheme := some("semver-spec")

javacOptions ++= Seq("-source", "21", "-target", "21")
scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Wunused:all",
  "-Xfatal-warnings"
)
scalaVersion := "3.6.4"
libraryDependencies ++= (
  zioDependencies ++
  zioTestDependencies ++
  logbackDependencies
)
testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
coverageDataDir := target.value / "reports"
