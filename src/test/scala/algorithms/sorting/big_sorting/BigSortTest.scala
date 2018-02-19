package algorithms.sorting.big_sorting

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}
import org.scalatest.{FlatSpec, Matchers}
import scala.io.Source

class BigSortTest extends FlatSpec with Matchers {

  val prefix = "algorithms/sorting/big_sorting/basic"

  def readFileToString(fileName: String): String =
    Source.fromResource(fileName).getLines.mkString("\n")

  "Big Sorting" should "work" in {
    val myOut = new ByteArrayOutputStream
    Console.withOut(new PrintStream(myOut)) {
      System.setIn(new ByteArrayInputStream(readFileToString(s"$prefix/test").getBytes()))

      Solution.main(Array.empty)
    }

    myOut.toString shouldEqual readFileToString(s"$prefix/expected")
  }

}