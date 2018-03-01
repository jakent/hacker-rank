package algorithms.warmup.plus_minus

import algorithms.IOSpec

class SolutionTest extends IOSpec {

  "Plus Minus" should "work" in {
    captureOutputWithInput(s"$prefix/test")(Solution.main(Array.empty)) shouldEqual readFileToString(s"$prefix/expected")
  }

}
