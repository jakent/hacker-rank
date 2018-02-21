package algorithms.warmup.compare_the_triplets

import algorithms.IOSpec

class SolutionTest extends IOSpec {

  "Compare the triplets" should "work" in {
    captureOutputWithInput(s"$prefix/test")(Solution.main(Array.empty)) shouldEqual readFileToString(s"$prefix/expected")
  }

}