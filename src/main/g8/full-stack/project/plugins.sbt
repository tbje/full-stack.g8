// fast development turnaround when using sbt ~re-start
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.7" exclude("org.apache.maven", "maven-plugin-api"))

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.5")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.5.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.23")

addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.7") // 1.0.8 depends on scalaJs 1.0.0-M3
