package example

object Looping {
  def main(args: Array[String]): Unit = {
    var x = 0;

    while (x < 10) {
      println(s"x = $x")
      x += 1
    }

    println("-----------------------------------------")

    do {
      println(s"x = $x")
      x -= 1
    } while (x >= 0)

    println("-----------------------------------------")
    for (i <- 1 to 5) { // 1.to(5)
      println(s"i = $i")
    }

    println("-----------------------------------------")
    for (i <- 1 until 5) { // 1.until(5)
      println(s"i = $i")
    }

    println("-----------------------------------------")
    for (i <- 1 until 5; j <- 1 to 2) { // 1.until(5)
      println(s"i = $i j = $j")
    }

    println("-----------------------------------------")
    val lst = List(1,2,3,5,9,5)
    for (i <- lst) { // 1.until(5)
      println(s"i = $i")
    }

    println("-----------------------------------------")

    for (i <- lst; if i != 5) { // 1.until(5)
      println(s"i = $i")
    }

    println("---------for loop as Statement--------")

    val sqllst = for {i <- lst; if i != 5} yield { // 1.until(5)
      i*i
    }
    println(sqllst)

    println("---------lambda--------")
    sqllst.foreach{i:Int => println(i)}

  }
}