package inheritance

class Circle(var radius:Double) extends Polygon with Shape {
  override def area : Double = 3.14*radius*radius
  def color: String = "Red"

}
