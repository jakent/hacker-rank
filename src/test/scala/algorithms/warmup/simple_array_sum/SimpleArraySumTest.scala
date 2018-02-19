package algorithms.warmup.simple_array_sum

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

import org.scalatest.{FlatSpec, Matchers}

import scala.io.Source

class SimpleArraySumTest extends FlatSpec with Matchers {

  val prefix = "algorithms/warmup/simple_array_sum/basic"

  def readFileToString(fileName: String): String =
    Source.fromResource(fileName).getLines.mkString("\n")

  "Simple Array Sum" should "work" in {
    val myOut = new ByteArrayOutputStream
    Console.withOut(new PrintStream(myOut)) {
      System.setIn(new ByteArrayInputStream(readFileToString(s"$prefix/test").getBytes()))

      Solution.main(Array.empty)
    }

    myOut.toString shouldEqual readFileToString(s"$prefix/expected")
  }

}