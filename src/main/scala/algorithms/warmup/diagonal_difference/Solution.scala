package algorithms.warmup.diagonal_difference

import scala.io.Source

object Solution {

  def diagonalDifference(a: Array[Array[Int]]): Int =  {
    val (_, d1, d2) = a.foldLeft((0, Array.empty[Int], Array.empty[Int]))((acc, a) => {
      (acc._1 + 1, acc._2 :+ a(acc._1), acc._3 :+ a(a.length - acc._1 - 1))
    })

    Math.abs(d1.sum - d2.sum)
  }

  def main(args: Array[String]) {
    val lines = Source.stdin.getLines()
    val nRows = lines.next.toInt

    print(diagonalDifference(lines.take(nRows).map(_.split(" ").map(_.toInt).toArray).toArray))
  }

}
