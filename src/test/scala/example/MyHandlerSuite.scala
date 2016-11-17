package example

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MyHandlerSuite extends FunSuite {
  import example.MyHandler.greeting

  test("greetings contains correct name info") {
    val nameInfo = new NameInfo()
    nameInfo.setFirstName("Renato")
    nameInfo.setLastName("Silva")
    assert(greeting(nameInfo) == "Greetings Renato Silva.")
  }

}
