package example

import scala.scalajs.js
import autowire._
import boopickle.Default._
import scala.util.{ Success, Failure }
import shared.MyType._
import scala.concurrent.ExecutionContext.Implicits.global
import org.scalajs.dom
import shared._

object Client extends js.JSApp {

  def el[T <: dom.raw.HTMLElement] (id: String) = dom.document.getElementById(id).asInstanceOf[T]

  def main(): Unit = {
    println(s"Trying to get time from server ...")

    val mainDiv = el[dom.html.Div](Ids.main)

    Wire[shared.Api].getFromServer().call().onComplete {
      case Success(m) =>
        val msg = m.msg + " " + m.time
        println(msg)
        mainDiv.textContent = msg
      case Failure(f) =>
        println("Failed call" + f)
        mainDiv.textContent = "Not able to contact server"
    }
  }
}
