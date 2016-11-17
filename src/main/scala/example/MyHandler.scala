package example

import scala.beans.BeanProperty

// Annotated properties to correctly generate getters and setters and addition of a default no-arg constructor,
// as required by the serialization process in AWS Lambda.
case class NameInfo(@BeanProperty var firstName: String, @BeanProperty var lastName: String) {
  def this() = this("", "")
}

case class Greeting(@BeanProperty var greeting: String) {
  def this() = this("")
}

object MyHandler {

  def greeting(name: NameInfo): Greeting = {
    Greeting(s"Greetings ${name.firstName} ${name.lastName}.")
  }

}



