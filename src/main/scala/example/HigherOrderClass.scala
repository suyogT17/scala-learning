package example

//Higher order functions able to take function as argument and can return function as value

object HigherOrderClass {

  def math(x:Double ,y:Double , f: (Double,Double) => Double) :Double = f(x,y)

  def main(args: Array[String]) : Unit ={
    var result1 = math(10,20, (x,y) => x max y)
    println(s"Result is: $result1")
    var result2 = math(10,20, (x,y) => x min y)
    println(s"Result is: $result2")
    var result3 = math(10,20, (x,y) => x + y)
    println(s"Result is: $result3")
    var result4 = math(10,20, _ * _) // underscore here is wildcard which states need to add something
    println(s"Result is: $result4")




  }
}