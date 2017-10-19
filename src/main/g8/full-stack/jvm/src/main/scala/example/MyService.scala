package example
import shared._

object MyService extends Api {

  def getFromServer(): MyType =
    MyType("The time is", new java.util.Date)

}
