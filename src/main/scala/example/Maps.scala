package example

object Maps {
  val maps: Map[Int, String] = Map(1 -> "a", 2 -> "b", 3 -> "c");

  def main(args: Array[String]): Unit = {
    println(maps)
    println(maps.keys)
    println(maps.values)
    println(maps.isEmpty)
    maps.keys.foreach{ key => println(key+" => "+maps(key))}
    println(maps.contains(1))
    println(maps.size)

  }
}
