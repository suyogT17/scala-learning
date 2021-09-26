package inheritance

abstract class Polygon {
  def area : Double = 0.0
}

trait Shape{ /// Similar to Interface in Java
  def color: String ; //abstract method in trait
}

object Polygon{
  def main(args: Array[String]): Unit = {
    //var poly = new Polygon //throws error after making it abstract
    //printArea(poly)
    var rect = new Rectangle(10.0,20.0)
    printArea(rect)
    println(rect.color)
    var circle = new Circle(3)
    printArea(circle)
    println(circle.color)
  }

  def printArea(p: Polygon): Unit ={
    println(p.area)
  }
}