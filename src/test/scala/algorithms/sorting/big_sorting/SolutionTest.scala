package algorithms.sorting.big_sorting

import algorithms.IOSpec

class SolutionTest extends IOSpec {

  "Big Sorting" should "work" in {
    captureOutputWithInput(s"$prefix/test")(Solution.main(Array.empty)) shouldEqual readFileToString(s"$prefix/expected")
  }

}