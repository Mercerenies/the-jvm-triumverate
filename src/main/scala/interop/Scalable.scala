
package interop

/*
 * The singleton object syntax in Scala desugars to a completely ordinary use of the singleton pattern in Java.
 * There's no unusual magic going on there.
 */
object Scalable {

  /*
   * Case objects end up creating a lot of convenient code for us, including a toString() that we'll use later.
   */
  case object SomethingBrilliant

  /*
   * Methods are translated directly into Java. In Scala, this method has type () => Unit. In Java, it will be
   * a 0-ary method which returns a BoxedUnit.
   */
  def sayHello(): Unit = {
    println("And I'm Scala!")
  }

  /*
   * In Java, the Scala functions will be instances of the Scala class Function1.
   */
  val someFunction = { (x: String) =>
    println(s"You gave me '$x' as an argument.")
  }

  /*
   * We can access classes created in Java very fluidly on the Scala side of things.
   */
  def duplicateBox(box: Box): Box =
    new Box("newBox", box.getObject())

}
