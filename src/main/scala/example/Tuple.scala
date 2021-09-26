package example

object Tuple {

  var tuple = (1, "suyog", "T", true)
  var tuple1 = new Tuple2(1, "suyog") // Allowed upto Tuple22
  var tuple2 = new Tuple3(1, "suyog", (9,9)) // Allowed upto Tuple22

  def main(args: Array[String]): Unit = {
    println(tuple)
    println(tuple._1+" "+tuple._2+" "+tuple._3+" "+tuple._4)
    println(tuple1)
    tuple1.productIterator.foreach(v => println(v))
    println(111 -> "hello" -> 2)
    println(tuple2._3._1)
  }

}
