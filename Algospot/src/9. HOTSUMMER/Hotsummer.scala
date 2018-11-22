/**
  * Created by NDS_047 on 2018-11-21.
  */
object Hotsummer {
  def main(args: Array[String]): Unit = {
    var cases = Integer.parseInt(readLine())
    while (cases > 0) {
      val GoalW: Int = Integer.parseInt(readLine())
      val UsedW: Int = readLine().split(" ").map(_.toString.toInt).sum
      if(GoalW >= UsedW){
        println("YES")
      } else {
        println("NO")
      }
      cases -= 1
    }
  }
}
