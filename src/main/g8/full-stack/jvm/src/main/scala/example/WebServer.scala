package example

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.typesafe.config.ConfigFactory

object WebServer {
  def main(args: Array[String]) = {
    implicit val system = ActorSystem("server-system")

    val config = ConfigFactory.load()
    val interface = config.getString("http.interface")
    val port = config.getInt("http.port")

    val service = new WebService()
    import system.dispatcher
    Http().bindAndHandle(service.apply(), interface, port)

    println(s"Server online at http://\$interface:\$port")

  }
}
