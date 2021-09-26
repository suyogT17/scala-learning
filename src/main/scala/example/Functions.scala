package example

object Functions {

  object Math{
    def +(val1:Int ,val2:Int) ={
      val1+val2
    }

    def **(val1:Int) :Long = val1*val1
  }

  def main(args: Array[String]): Unit = {
    println(Math.+(10,20))
    val add = (x:Int,y:Int) => x+y
    println(add(30,4))
    println(Math.**(200))
  }

}
