name := "xgboost-java"

crossPaths := false
autoScalaLibrary := false

version := "1.3.3-1"

sonatypeProfileName := "io.github.metarank"

organization := "io.github.metarank"

scalacOptions ++= Seq("-feature", "-deprecation")

libraryDependencies ++= Seq(
  "junit"                % "junit"           % "4.13.1" % "test",
  "commons-logging"      % "commons-logging" % "1.2",
  "com.esotericsoftware" % "kryo"            % "4.0.2",
  "org.apache.hadoop"    % "hadoop-hdfs"     % "2.7.3"  % "provided",
  "org.apache.hadoop"    % "hadoop-common"   % "2.7.3"  % "provided"
)
