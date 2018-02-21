package algorithms.warmup.diagonal_difference

import algorithms.IOSpec

class SolutionTest extends IOSpec {

  "Diagonal difference" should "work" in {
    captureOutputWithInput(s"$prefix/test")(Solution.main(Array.empty)) shouldEqual readFileToString(s"$prefix/expected")
  }

}