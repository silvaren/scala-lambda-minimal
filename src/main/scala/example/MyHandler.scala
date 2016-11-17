package example

import scala.beans.BeanProperty

case class NameInfo(@BeanProperty var firstName: String, @BeanProperty var lastName: String) {
  def this() = this("name", "lastname")
}

object MyHandler {

  def greeting(name: NameInfo): String = {
    s"Greetings ${name.firstName} ${name.lastName}."
  }

}
