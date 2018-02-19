package algorithms.graph_theory.even_tree

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

import org.scalatest.{FlatSpec, Matchers}

import scala.io.Source

class SolutionTest extends FlatSpec with Matchers {

  val prefix = "algorithms/graph_theory/even_tree/basic"

  def readFileToString(fileName: String): String =
    Source.fromResource(fileName).getLines.mkString("\n")

  "Even Tree" should "work" in {
    val myOut = new ByteArrayOutputStream
    Console.withOut(new PrintStream(myOut)) {
      System.setIn(new ByteArrayInputStream(readFileToString(s"$prefix/test").getBytes()))

      Solution.main(Array.empty)
    }

    myOut.toString shouldEqual readFileToString(s"$prefix/expected")
  }

}