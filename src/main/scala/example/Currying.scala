package example
//used to convert function to take only single argument
object Currying {

  def sum(x:Int) = (y:Int) =>  x+y
  def sum2(x:Int)(y:Int) =  x+y

  def main(args: Array[String]): Unit = {
      println(sum(10)(20))
      val sumfun = sum(40)
      println(sumfun(40))
      println(sum(1009)(20))
      val sumfun2 = sum2(40)(_)
      println(sumfun2(400))
  }

}
