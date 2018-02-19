package algorithms.sorting.big_sorting

import scala.io.Source

object Solution {

  def main(args: Array[String]) {
    val lines = Source.stdin.getLines()
    val nNumbers = lines.next.toInt
    print(lines.take(nNumbers).toSeq.sortWith((a, b) => if (a.length == b.length) a < b else a.length < b.length ).mkString("\n"))
  }

}