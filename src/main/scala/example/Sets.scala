package example

object Sets {

  val set1: Set[Int] = Set(1, 2, 4, 4)
  val set5: Set[Int] = Set(7, 9, 8, 3, 4, 2)

  val set2: Set[String] = Set("abc", "bgv")
  val set3 = Set("gdg", "jjhjhjhj")
  var set4 = scala.collection.mutable.Set("i", "am", "abc")


  def main(args: Array[String]): Unit = {
    set1.foreach(i => print(s"$i "))
    println()

    set2.foreach(i => print(s"$i "))
    println()

    set3.foreach(i => print(s"$i "))
    println()

    println(set1.head)
    println(set1.tail)
    println(set1.isEmpty)

    set4 = set4 + "Suyog"
    println(set4 +" ")
    var set6 = set1.++(set5)
    println(set6)
    println(set6+10)
    println(set5.intersect(set1))

    val set7 = set5 & set1
    set6 = set6 + 11 + 23 + 21
    println("Set6: " + (set7+20))
    println("Max: "+set6.max)
    println("Min: "+set6.min)
    println("-----------------------------")
    for (set <- set7) {
      println(s"set el: $set")
    }


  }
}
