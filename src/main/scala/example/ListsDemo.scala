package example

object ListsDemo {

  def main(args: Array[String]): Unit = {
    var list = List(1,5,2,9,3)
    list.foreach(i => print(i+" "))
    println()
    list = list.reverse // does not change existing values of list
    list.foreach{i:Int => print(i+" ")}
    println()
    list  = list.drop(2) // remove first 2 elements
    list.foreach{i:Int => print(i+" ")}
    println()
    list = list.take(2) // takes first element
    list.foreach{i:Int => print(i+" ")}



  }
}
