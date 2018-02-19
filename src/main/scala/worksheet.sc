
def getMaxProfit(prices: Array[Int]) = {
  val reverse = prices.reverse

  reverse.foldLeft((0, 0))((acc, price) => {
    if (price >= acc._1) (price, acc._2)
    else (acc._1, acc._2 + acc._1 - price)
  })._2
}

val s = Array(5, 3, 2)
val ss = List(1, 2, 100)
val sss = List(1, 3, 1, 2)
getMaxProfit(s)
//getMaxProfit(s) == 0
//getMaxProfit(ss)
//getMaxProfit(ss) == 197
//getMaxProfit(sss)
//getMaxProfit(sss) == 3