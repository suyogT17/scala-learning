package example


//closure is the function which used one or more variables declared outside of the function
object Closures {
  var number = 10 // impure closure
  val number1 = 20 // pure closure
  def add(x:Int) = {
    number = number + x
    number
  }

  def main(args:Array[String]):Unit={
    println(add(20))
    //number = 20
    println(add(100))
  }

}
