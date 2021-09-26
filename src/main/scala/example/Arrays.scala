package example

import  Array._
object Arrays {
  var arr:Array[Int] =  new Array[Int](5)
  val arr1 =  new Array[Int](5)
  val arr2 =  Array(1,2,4,8,5)

  def main(args: Array[String]): Unit = {
    arr(0) = 10
    arr(1) = 10
    arr(3) = 10

    for(x <- arr){
      print(s"$x ")
    }

    for(i <- 0 to arr.length-1){
      println(arr(i))
    }

    println(arr2.length)

    val concatRes = concat(arr1,arr2)
    concatRes.foreach{ i => println(i)}

  }

}
