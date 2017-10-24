package shared

object MyType {
  import boopickle.Default._
  implicit val datePickler = transformPickler((t: Long) => new java.util.Date(t))(_.getTime)
}

case class MyType(msg: String, time: java.util.Date)
