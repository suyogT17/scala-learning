package  example

import scala.io.StdIn._
object Match{
  def main(args: Array[String]): Unit = {
    val age = readLine().toInt
    age match {
      case 18 =>{
        println(s"age is $age")
      }
      case 119 => println(s"age is $age")
      case 20 => println(s"age is $age")
      case 21 => println(s"age is $age")
      case 10 => println(s"age is $age")
      case _ => println(s"default $age")

    }

    val res = age match {
      case 18 =>{
        age
      }
      case 119 => age
      case 20 => age
      case 21 => age
      case 10 => age
      case _ => age // default case
    }
    println((res*2));

    age match {
      case 1|3|5|7|9 => println("odd number")
      case 2|4|6|8|10 => println("even number")
      case _ => println("invalid range")

    }

  }
}