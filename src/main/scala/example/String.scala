package example

object String {

  val num1 = 100
  val num2 = 75.90
  val str1 : String = "Suyog"

  def main(args: Array[String]): Unit = {

    val res = printf("(%d -- %f -- %s)",num1,num2,str1)
    println(res)
    println("(%d -- %2f -- %s)".format(num1,num2,str1))

  }
}
