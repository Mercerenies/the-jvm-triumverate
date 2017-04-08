
package interop

object Scalable {

  case object SomethingBrilliant

  def sayHello(): Unit = {
    println("And I'm Scala!")
  }

  val someFunction = { (x: String) =>
    println(s"You gave me '$x' as an argument.")
  }

  def duplicateBox(box: Box, x: AnyRef): Box =
    new Box("newBox", x)

}
