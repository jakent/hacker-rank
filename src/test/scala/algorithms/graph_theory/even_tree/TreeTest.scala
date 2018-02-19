package algorithms.graph_theory.even_tree

import org.scalatest.{FlatSpec, Matchers}

class TreeTest extends FlatSpec with Matchers {

  "Tree" should "grow" in {
    val actual = Tree(Seq(Seq(2, 1), Seq(3, 1)))
      .grow(4, 3)
      .grow(5, 2)
      .grow(6, 1)
      .grow(7, 2)
      .grow(8, 6)

    val expected = Tree(1,
      List(
        Tree(2, List(Tree(5, Nil), Tree(7, Nil))),
        Tree(3, List(Tree(4, Nil))),
        Tree(6, List(Tree(8, Nil)))
      )
    )

    actual shouldEqual expected
  }

}
