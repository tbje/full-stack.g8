resolvers += Resolver.bintrayIvyRepo("eed3si9n", "sbt-plugins")

// fast development turnaround when using sbt ~re-start
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.15.0" exclude("org.apache.maven", "maven-plugin-api"))

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.4")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.1.1")

addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.1.0")
