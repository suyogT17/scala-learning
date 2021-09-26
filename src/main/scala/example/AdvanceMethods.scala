package example

object AdvanceMethods {

  val lst = List(1, 2, 3, 4, 5, 6, 7)
  val lst2 = List("A", "B", "C")
  def main(args: Array[String]): Unit = {

    println(lst.reduceLeft(_ + _))
    println(lst2.reduceLeft(_ + _))
    println(lst.reduceLeft((x,y) => { println(s"$x, $y"); x+y}))
    println("-------------------------------------------------")
    println(lst.reduceRight((x,y) => { println(s"$x, $y"); x+y}))

    println(lst.foldLeft(0)(_ + _))
    println(lst.foldLeft(10)(_ + _))
    println(lst2.foldLeft("suyog ")(_ + _))

    println(lst.scanLeft(10)(_ + _))
    println(lst2.scanLeft("suyog ")(_ + _))



  }

}
