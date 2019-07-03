object areaCalculator {

  def main( args: Array[String] ): Unit = {

    val circle = new Circle
    println(circle.area(3 ))

    val square = new Square
    println(square.area(3 ))

    val rectangle = new Rectangle
    println(rectangle.area(3, 4 ))
  }
}

abstract class Shape {
  def area: Double
}

class Circle extends Shape {
  override def area(diameter: Double): Double = {
    diameter * Math.PI
  }
}

class Square extends Shape {
  override def area( side: Double): Double  = {
    side * side
  }
}

class Rectangle extends Shape {
  override def area ( side1: Double, side2: Double): Double = {
    side1 * side2
  }
}

