name         := """play-example"""
organization := "com.hivemind"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "3.5.2"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
libraryDependencies += "org.typelevel"          %% "cats-effect"        % "3.5.4"
libraryDependencies += "org.typelevel"          %% "cats-core"          % "2.10.0"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.hivemind.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.hivemind.binders._"

resolvers += "Artima Maven Repository" at "https://repo.artima.com/releases"

scalacOptions ++= Seq(
  "-explain",         // explain errors in more detail
  "-explain-types",   // explain type errors in more detail
  "-feature",         // emit warning and location for usages of features that should be imported explicitly
  "-indent",          // allow significant indentation.
  // "-new-syntax",      // require `then` and `do` in control expressions.
  "-print-lines",     // show source code line numbers.
  "-Xkind-projector", // allow `*` as wildcard to be compatible with kind projector
  // "-Werror",          // fail the compilation if there are any warnings
  "-Xmigration",      // warn about constructs whose behavior may have changed since version
  "-explain-cyclic",
)
