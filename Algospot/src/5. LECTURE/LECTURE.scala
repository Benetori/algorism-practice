/**
  * Created by NDS_047 on 2018-11-20.
  */
object Main {
  def main(args: Array[String]): Unit = {
    var cases = Integer.parseInt(readLine())
    while (cases > 0) {
      val grouped = readLine().grouped(2).toList.sortWith(_ < _)
      println(grouped.mkString(""))
      cases -= 1
    }
  }
}
