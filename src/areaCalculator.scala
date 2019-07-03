
object areaCalculator {

  def main( args: Array[String] ): Unit = {
    val piada = new Circle
    println(piada.area(4 ))
    val toast = new Square
    println(toast.area(5 ))
    val biscuit = new Rectangle
    println(biscuit.area( 3, 5))
    val harlequin = new Rhombus
    println(harlequin.area( 3, 4))
    val croissant = new Triangle
    println(croissant.area( 8, 12))
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
