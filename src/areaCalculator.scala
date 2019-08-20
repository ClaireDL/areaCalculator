
object Main extends App {
  val myListOfShapes: Seq[Shape] = Seq(
    new Circle("piada", 4),
    new Rectangle( "petit Beurre", 3, 5),
    new Square("shortbread", 3),
    new Rhombus("harlequin", 2.5, 4)
  )

  for { shape <- myListOfShapes } {
    println(s"The area of ${shape.name} is ${shape.area}")
  }
}

// Abstract class
abstract class Shape(shapeName: String) {
  var name: String = shapeName
  def area: Double
}

class Circle(_shapeName: String, diameter: Double) extends Shape(_shapeName) {
  override def area: Double = {
    diameter * math.Pi
  }
}

class Rectangle(_shapeName: String, side1: Double, side2: Double) extends Shape(_shapeName) {
  override def area: Double = {
    side1 * side2
  }
}

class Square(_shapename: String, side: Double) extends Shape(_shapename) {
  override def area: Double = {
    math.pow(side, 2)
  }
}

class Rhombus(_shapename: String, side1: Double, side2: Double) extends Shape(_shapename) {
  override def area: Double = {
    side1 * side2
  }
}