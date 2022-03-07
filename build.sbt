name := "proyecto_test"

version := "0.1"

scalaVersion := "2.12.11"

val sparkVersion = "3.2.1"
libraryDependencies += "org.beanshell" % "bsh" % "2.0b4"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
  "com.google.cloud.spark" %% "spark-bigquery-with-dependencies" % "0.22.2" % "provided",
  "com.google.cloud.bigdataoss" % "bigquery-connector" % "hadoop3-1.2.0" % "provided",
  "com.github.scopt" %% "scopt" % "4.0.0",
  "com.google.cloud" % "google-cloud-secretmanager" % "2.0.1"
)

