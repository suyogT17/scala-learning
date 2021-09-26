package example

object Lists {

  val list1 : List[Int] = List(1,2,4)
  val list2 : List[String] = List("abc","bgv")
  val list3 = List("gdg","jjhjhjhj")
  def main(args: Array[String]): Unit = {
    list1.foreach(i => print(s"$i "))
    println()

    list2.foreach(i => print(s"$i "))
    println()

    list3.foreach(i => print(s"$i "))
    println()

    println(9 :: list1) //:: cons
    println(0 :: 9 :: 2 :: Nil)
    println(list1.head)
    println(list1.tail)
    println(list1.isEmpty)
    println(list1.reverse)
    println(List.fill(4)(2))
    list1.foreach(println)
    var sum:Int = 0
    list1.foreach(sum += _)
    println("Sum : "+sum)
  }
}
