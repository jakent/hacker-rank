package algorithms.warmup.simple_array_sum

object Solution {

  def main(args: Array[String]) {
    print(io.Source.stdin.getLines().drop(1).next.split(" ").map(_.toInt).sum)
  }

}
