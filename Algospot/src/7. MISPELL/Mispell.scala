import scala.collection.mutable.ListBuffer

object Mispell {
  def main(args: Array[String]): Unit = {
    var cases = Integer.parseInt(readLine())
    var result = List[String]()
    while (cases > 0) {
      val InputData = readLine().split(" ").toList
      val InputNum = InputData(0).toInt - 1
      val InputWord = InputData(1).grouped(1).to[ListBuffer]
      InputWord.remove(InputNum)
      result = result :+ InputWord.mkString("")
      cases -= 1
    }
    for(x <- 0 until result.length){
      println((x + 1) + " " + result(x).mkString(""))
    }
  }
}
