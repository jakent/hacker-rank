package algorithms

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

import org.scalatest.{FlatSpec, Matchers}

import scala.io.Source

trait IOSpec extends FlatSpec with Matchers {

  val prefix: String = this.getClass.getPackage.getName.replaceAll("\\.", "/")

  def readFileToString(fileName: String): String =
    Source.fromResource(fileName).getLines.mkString("\n")

  def captureOutputWithInput(inputFilePath: String)(block: => Any): String = {
    val myOut = new ByteArrayOutputStream
    Console.withOut(new PrintStream(myOut)) {
      System.setIn(new ByteArrayInputStream(readFileToString(inputFilePath).getBytes()))

      block
    }

    myOut.toString
  }

}
