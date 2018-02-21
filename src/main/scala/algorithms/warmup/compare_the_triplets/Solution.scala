package algorithms.warmup.compare_the_triplets

object Solution {

  def main(args: Array[String]) {
    val v = io.Source.stdin.getLines().take(2).map(_.split(" ").map(_.toInt)).toList

    val r = v match {
      case h :: t :: Nil => h.zip(t)
    }

    val (a, b) = r.foldLeft((0, 0))((acc, t) => t match {
      case (a, b) if a > b => (acc._1 + 1, acc._2)
      case (a, b) if a < b => (acc._1, acc._2 + 1)
      case _ => acc
    })

    print(s"$a $b")
  }
}
