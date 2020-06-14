// fast development turnaround when using sbt ~re-start
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10" exclude("org.apache.maven", "maven-plugin-api"))

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.3")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.0.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.1.0")

addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.1.0")
