package example

import java.io.StringWriter

import org.codehaus.jackson.map.ObjectMapper
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
    assert(greeting(nameInfo).body.greeting == "Greetings Renato Silva.")
  }

  test("greetings response deserializes correctly") {
    val nameInfo = new NameInfo()
    nameInfo.setFirstName("Renato")
    nameInfo.setLastName("Silva")
    val response = greeting(nameInfo)
    val mapper = new ObjectMapper()
    val out = new StringWriter
    mapper.writeValue(out, response)
    val json = out.toString()
    val expected = "{\"statusCode\":200,\"headers\":{\"coolheader2\":\"coolvalue2\",\"coolheader\":\"coolvalue\"},\"body\":{\"greeting\":\"Greetings Renato Silva.\"}}"
    assert(json === expected)
  }

}
