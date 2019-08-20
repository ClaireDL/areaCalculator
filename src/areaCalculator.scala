
object Main extends App {
  val myListOfShapes: Seq[Shape] = Seq(
    new Circle("piada", 4)
  )

  for { shape <- myListOfShapes } {
    println(s"The area of ${shape.name} is ${shape.area}")
  }
}

// Abstract class
abstract class Shape(shapeName: String, dimension: Double) {
  var name: String = shapeName
  def area: Double = {
    3 * 3
  }
}

class Circle(_shapeName: String, diameter: Double) extends Shape(_shapeName, diameter) {
    override def area: Double = {
    diameter * math.Pi
  }
}