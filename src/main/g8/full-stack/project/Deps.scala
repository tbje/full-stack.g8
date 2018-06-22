object Version {
  val akkaHttp = "10.1.3"
  val akka = "2.5.13"
  val autowire = "0.2.6"
  val boopickle = "1.3.0"
  val monocle = "1.5.0"
  val scala = "2.12.6"
  val scalajsDom = "0.9.6"
  val scalajsScripts = "1.1.2"
  val scalatags = "0.6.7"
}

object Deps {
  import sbt._
  import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
  import org.scalajs.sbtplugin.ScalaJSPlugin
  import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

  val shared = Def.setting(
    "com.lihaoyi" %%% "autowire" % Version.autowire ::
    "com.lihaoyi" %%% "scalatags" % Version.scalatags  ::
    "com.github.julien-truffaut" %%%  "monocle-core"  % Version.monocle ::
    "com.github.julien-truffaut" %%%  "monocle-macro" % Version.monocle ::
    "io.suzaku" %%% "boopickle" % Version.boopickle ::
      Nil)

  val server = Def.setting(shared.value ++ (
    "com.typesafe.akka" %%% "akka-http" % Version.akkaHttp ::
    "com.typesafe.akka" %%% "akka-actor" % Version.akka ::
    "com.typesafe.akka" %%% "akka-stream" % Version.akka ::
    "com.vmunier" %%% "scalajs-scripts" % Version.scalajsScripts ::
      Nil))

  val client = Def.setting(shared.value ++ (
    "org.scala-js" %%% "scalajs-dom" % Version.scalajsDom ::
     Nil))

}
