package example

//Return Some or None
object Options {

  val lst = List(1,2,3)
  val map = Map(1 -> "a",  2 -> "b", 3 -> "c")
  val opt : Option[Int] = Some(66)
  val opt1 : Option[Int] = None

  def main(args: Array[String]): Unit = {
    println(lst.find(_ > 2).get)
    println(lst.find(_ > 4).getOrElse("Not Exist"))
    println(map.get(2).get)

    println(opt.isEmpty)
    println(opt1.isEmpty)
  }

}
