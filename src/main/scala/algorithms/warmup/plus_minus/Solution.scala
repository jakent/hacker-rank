package algorithms.warmup.plus_minus

import scala.io.Source

object Solution {

  def round(d: Double) = {
    BigDecimal(d).setScale(6, BigDecimal.RoundingMode.HALF_UP)
  }

  def main(args: Array[String]) {
    val lines = Source.stdin.getLines()
    val ints = lines.drop(1).next.split(" ").map(_.toInt).toList

    println(round(ints.count(_ > 0)/ints.length.toDouble))
    println(round(ints.count(_ < 0)/ints.length.toDouble))
    print(round(ints.count(_ == 0)/ints.length.toDouble))
  }

}
