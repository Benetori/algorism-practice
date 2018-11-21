/**
  * Created by NDS_047 on 2018-11-21.
  */
object Encrypt {
    def main(args: Array[String]): Unit = {
      var cases = Integer.parseInt(readLine())
      while (cases > 0) {
        var TmpEven = List[String]()
        var TmpOdd = List[String]()
        var grouped = readLine().grouped(1).toList
        for( x <- 0 until grouped.length){
          if(x % 2 == 0) {
            TmpEven = TmpEven :+ grouped(x)
          } else {
            TmpOdd = TmpOdd :+ grouped(x)
          }
        }
        println((TmpEven ::: TmpOdd).mkString(""))
        cases -= 1
      }
   }
}
