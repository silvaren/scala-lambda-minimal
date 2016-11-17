package example

import java.util

import scala.beans.BeanProperty

case class NameInfo(@BeanProperty var firstName: String, @BeanProperty var lastName: String) {
  def this() = this("", "")
}

case class Greeting(@BeanProperty var greeting: String) {
  def this() = this("")
}

case class Response(@BeanProperty var statusCode: Int,
                    @BeanProperty var headers: util.Map[String,String],
                    @BeanProperty var body: Greeting) {
  def this() = this(500, new util.HashMap(), Greeting(""))
}

object MyHandler {

  def greeting(name: NameInfo): Response = {
    val headers = new util.HashMap[String, String]()
    headers.put("coolheader", "coolvalue")
    headers.put("coolheader2", "coolvalue2")
    Response(
      200,
      headers,
      Greeting(s"Greetings ${name.firstName} ${name.lastName}.")
    )
  }

}



