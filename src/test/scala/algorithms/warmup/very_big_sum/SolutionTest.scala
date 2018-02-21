package algorithms.warmup.very_big_sum

import algorithms.IOSpec

class SolutionTest extends IOSpec {

  "A Very Big Sum" should "work with basic input" in {
    captureOutputWithInput(s"$prefix/test")(Solution.main(Array.empty)) shouldEqual readFileToString(s"$prefix/expected")
  }

}