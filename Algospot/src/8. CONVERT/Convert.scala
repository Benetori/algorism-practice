/**
  * Created by NDS_047 on 2018-11-21.
  */
object Convert {
  def main(args: Array[String]): Unit = {
    var cases = Integer.parseInt(readLine())
    var result = List[String]()
    while(cases > 0) {
      val InputData = readLine().split(" ").toList
      InputData(1) match {
        case "kg" => result = result :+ ("%1.4f".format((InputData(0).toDouble * 2.2046)).toString + " lb")
        case "lb" => result = result :+ ("%1.4f".format((InputData(0).toDouble * 0.4536)).toString + " kg")
        case "l" => result = result :+ ("%1.4f".format((InputData(0).toDouble * 0.2642)).toString + " g")
        case "g" => result = result :+ ("%1.4f".format((InputData(0).toDouble * 3.7854)).toString + " l")
      }
      cases -= 1
    }
    for ( x <- 0 until result.length ) {
      println((x + 1) + " " + result(x))
    }
  }
}
