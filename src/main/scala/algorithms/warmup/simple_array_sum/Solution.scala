package algorithms.warmup.simple_array_sum

import scala.io.Source

object Solution {

  def main(args: Array[String]) {
    print(Source.stdin.getLines().drop(1).next.split(" ").map(_.toInt).sum)
  }

}
