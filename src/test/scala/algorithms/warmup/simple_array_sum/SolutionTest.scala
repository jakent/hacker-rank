package algorithms.warmup.simple_array_sum

import algorithms.IOSpec

class SolutionTest extends IOSpec {

  "Simple Array Sum" should "work" in {
    captureOutputWithInput(s"$prefix/test")(Solution.main(Array.empty)) shouldEqual readFileToString(s"$prefix/expected")
  }

}