package algorithms.graph_theory.even_tree

case class Tree(n: Int, children: Seq[Tree]) {
  def grow(node: Int, parent: Int): Tree = {
    if (n == parent) Tree(n, children :+ Tree(node, Nil))
    else Tree(n, children.map(_.grow(node, parent)))
  }

  def size: Int = {
    children.foldLeft(1)((acc, tree) => acc + tree.size)
  }
}

object Tree {
  def apply(nodes: Seq[Seq[Int]]): Tree = {
    nodes.foldLeft(Tree(1, Nil))((acc, edge) => edge match {
      case l :: r :: Nil => acc.grow(l, r)
    })
  }

  def transform(t: Tree)(f: Tree => Int): Tree =
    Tree(f(t), t.children.map(b => Tree.transform(b)(f)))

  def flatten(t: Tree): Seq[Int] = {
    def loop(c: Seq[Tree], acc: Seq[Int]): Seq[Int] = c match {
      case h :: tail => loop(tail, acc)  ++ loop(h.children, Seq(h.n))
      case Nil => acc
    }

    loop(t.children, Seq(t.n))
  }

  def evenForests(start: Tree): Int = {
    Tree.flatten(Tree.transform(start)(_.size)).tail.count(_ % 2 == 0)
  }
}