package algorithms.graph_theory.even_tree

import algorithms.IOSpec

class SolutionTest extends IOSpec {

  "Even Tree" should "work" in {
    captureOutputWithInput(s"$prefix/test")(Solution.main(Array.empty)) shouldEqual readFileToString(s"$prefix/expected")

  }

}