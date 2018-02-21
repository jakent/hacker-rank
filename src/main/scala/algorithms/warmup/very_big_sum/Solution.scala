package algorithms.warmup.very_big_sum

import scala.io.Source

object Solution {
  def main(args: Array[String]) {
    print(Source.stdin.getLines.drop(1).next.split(" ").map(_.toLong).sum)
  }
}
