name := """MyEvent"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)
PlayKeys.externalizeResources := false

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies += guice

// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.197"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

//https://www.webjars.org/documentation
libraryDependencies += "org.webjars" % "bootstrap" % "3.1.1-2"

//Play's file watcher
libraryDependencies += "com.lightbend.play" %% "play-file-watch" % "1.1.3"

// https://mvnrepository.com/artifact/org.mongodb.morphia/morphia
libraryDependencies += "org.mongodb.morphia" % "morphia" % "1.3.2"
// https://mvnrepository.com/artifact/org.mongodb/mongo-java-driver
libraryDependencies += "org.mongodb" % "mongo-java-driver" % "3.8.2"
// https://mvnrepository.com/artifact/com.thoughtworks.proxytoys/proxytoys
libraryDependencies += "com.thoughtworks.proxytoys" % "proxytoys" % "1.0"
// https://mvnrepository.com/artifact/cglib/cglib-nodep
libraryDependencies += "cglib" % "cglib-nodep" % "3.2.8"

//https://github.com/playframework/play-mailer
libraryDependencies += "com.typesafe.play" %% "play-mailer" % "6.0.1"
libraryDependencies += "com.typesafe.play" %% "play-mailer-guice" % "6.0.1"

// https://mvnrepository.com/artifact/org.json/json
libraryDependencies += "org.json" % "json" % "20180813"

// https://mvnrepository.com/artifact/org.apache.httpcomponents/httpclient
libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.6"
// https://mvnrepository.com/artifact/commons-codec/commons-codec
libraryDependencies += "commons-codec" % "commons-codec" % "1.11"
// https://mvnrepository.com/artifact/commons-logging/commons-logging
libraryDependencies += "commons-logging" % "commons-logging" % "1.2"
// https://mvnrepository.com/artifact/org.apache.httpcomponents/httpcore
libraryDependencies += "org.apache.httpcomponents" % "httpcore" % "4.4.10"




