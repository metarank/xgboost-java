name := "xgboost-java"

crossPaths := false

autoScalaLibrary := false

version := "2.0.2-1"

//javacOptions ++= Seq("-release", "8")

sonatypeProfileName := "io.github.metarank"

organization := "io.github.metarank"

publishMavenStyle := true

publishTo := sonatypePublishToBundle.value

licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/metarank/xgboost-java"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/metarank/xgboost-java"),
    "scm:git@github.com:metarank/xgboost-java.git"
  )
)
developers := List(
  Developer(id = "romangrebennikov", name = "Roman Grebennikov", email = "grv@dfdx.me", url = url("https://dfdx.me/"))
)

scalacOptions ++= Seq("-feature", "-deprecation")

libraryDependencies ++= Seq(
  "junit"             % "junit"           % "4.13.2" % "test",
  "com.github.sbt"    % "junit-interface" % "0.13.3" % Test,
  "org.slf4j"         % "slf4j-api"       % "2.0.5",
  "org.apache.hadoop" % "hadoop-hdfs"     % "2.10.1" % "provided",
  "org.apache.hadoop" % "hadoop-common"   % "2.10.1" % "provided"
)
