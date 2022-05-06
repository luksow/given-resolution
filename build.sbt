val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "given-resolution",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "org.tpolecat" %% "doobie-core" % "1.0.0-RC1",
    libraryDependencies += "org.tpolecat" %% "doobie-postgres" % "1.0.0-RC1"
  )
