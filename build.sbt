import sbtappengine.Plugin.{AppengineKeys => gae}

import play.PlayProject

name := """testApp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)

resolvers += "Scala AppEngine Sbt Repo" at "http://siderakis.github.com/maven"


libraryDependencies ++= Seq(
  "com.siderakis" %% "futuraes" % "0.1-SNAPSHOT",
  "com.siderakis" %% "playframework-appengine-mvc" % "0.1-SNAPSHOT",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "org.mortbay.jetty" % "jetty" % "6.1.22" % "container"
)

appengineSettings

PlayProject.defaultPlaySettings