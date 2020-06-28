object Version {
  val akkaHttp       = "10.1.12"
  val akka           = "2.6.6"
  val autowire       = "0.3.2"
  val boopickle      = "1.3.3"
  val monocle        = "2.0.5"
  val scala          = "2.13.3"
  val scalajsDom     = "1.0.0"
  val scalajsScripts = "1.1.4"
  val scalatags      = "0.9.1"
}

object Deps {
  import sbt._
  import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
  import org.scalajs.sbtplugin.ScalaJSPlugin
  import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

  val shared = Def.setting(
    "com.lihaoyi"                %%% "autowire"        % Version.autowire ::
    "com.lihaoyi"                %%% "scalatags"       % Version.scalatags ::
    "com.github.julien-truffaut" %%% "monocle-core"    % Version.monocle ::
    "com.github.julien-truffaut" %%% "monocle-macro"   % Version.monocle ::
    "io.suzaku"                  %%% "boopickle"       % Version.boopickle ::
    Nil)

  val server = Def.setting(shared.value ++ (
    "com.typesafe.akka"          %%% "akka-http"       % Version.akkaHttp ::
    "com.typesafe.akka"          %%% "akka-actor"      % Version.akka ::
    "com.typesafe.akka"          %%% "akka-stream"     % Version.akka ::
    "com.vmunier"                %%% "scalajs-scripts" % Version.scalajsScripts ::
    Nil))

  val client = Def.setting(shared.value ++ (
    "org.scala-js"               %%% "scalajs-dom"     % Version.scalajsDom ::
    Nil))
}
