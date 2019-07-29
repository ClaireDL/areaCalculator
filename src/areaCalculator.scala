
object areaCalculator {

  def main( args: Array[String] ): Unit = {
    val piada = new Circle
    var result = piada.area(4 )
    println(s"piada: $result")

    val toast = new Square
    result = toast.area(5 )
    println(s"toast: $result")

    val biscuit = new Rectangle
    result = biscuit.area( 3, 5)
    println(s"biscuit: $result")

    val harlequin = new Rhombus
    result = harlequin.area( 3, 4)
    println(s"harlequin: $result")

    val croissant = new Triangle
    result = croissant.area( 8, 12)
    println(s"croissant: $result")
 }
}

abstract class Shape {}

class Circle extends Shape {
  def area ( diameter: Double ): Double = {
    diameter * math.Pi - ( diameter * math.Pi % 0.01 )
  }
}

class Square extends Shape {
  def area ( side: Double ): Double = {
    math.pow( side, 2 )
  }
}

class Rectangle extends Shape {
  def area ( side1: Double, side2: Double ): Double = {
    side1 * side2
  }
}

class Rhombus extends Shape {
  def area ( side1: Double, side2: Double ): Double = {
    side1 * side2
  }
}

class Triangle extends Shape {
  def area ( base: Double, height: Double ): Double = {
    ( base * height ) / 2
  }
}
