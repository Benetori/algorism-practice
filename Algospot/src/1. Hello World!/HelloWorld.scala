/**
  * Created by NDS_047 on 2018-10-04.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {
    var cases = Integer.parseInt(readLine())
    while (cases > 0) {
      println("Hello, " + readLine() + "!")
      cases -= 1
    }
  }
}