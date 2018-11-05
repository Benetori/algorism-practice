/**
  * Created by NDS_047 on 2018-10-04.
  */
object Endians {
  def main(args: Array[String]): Unit = {
    var cases = Integer.parseInt(readLine())
    while (cases > 0) {
      val x: Long = readInt()
      println(((x >>> 24)) | ((x >> 8) & 0xFF00) | ((x << 8) & 0xFF0000) | ((x % 256 << 24)))
      cases -= 1
    }
  }
}
