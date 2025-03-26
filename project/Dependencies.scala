import sbt.*

object Dependencies {

  val zioVersion = "2.1.16"
  val zioKafkaVersion = "2.12.0"
  val zioLoggingVersion = "2.5.0"
  val zioNioVersion = "2.0.2"

  val zioDependencies = Seq(
    "dev.zio" %% "zio" % zioVersion,
    "dev.zio" %% "zio-kafka" % zioKafkaVersion,
    "dev.zio" %% "zio-logging" % zioLoggingVersion,
    "dev.zio" %% "zio-logging-slf4j" % zioLoggingVersion,
    "dev.zio" %% "zio-nio" % zioNioVersion,
  )

  val zioTestDependencies = Seq(
    "dev.zio" %% "zio-test" % zioVersion % Test,
    "dev.zio" %% "zio-test-magnolia" % zioVersion % Test,
    "dev.zio" %% "zio-test-sbt" % zioVersion % Test
  )

  val logbackVersion = "1.5.18"
  val logstashLogbackVersion = "8.0"

  val logbackDependencies = Seq(
    "ch.qos.logback" % "logback-classic" % logbackVersion,
    "net.logstash.logback" % "logstash-logback-encoder" % logstashLogbackVersion
  )

}
