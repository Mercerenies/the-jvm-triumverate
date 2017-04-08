
package interop;

/*
 * We need to manually import a couple of Scala classes here, since they aren't provided to
 * Java by default.
 */
import scala.Function1;
import scala.None$;

public class Main {

    public static void main(String[] args) {

        /*
         * Please welcome the three languages we'll be using today!
         */
        System.out.println("What's up? I'm Java!");
        parens.sayHello();
        Scalable.sayHello();

        /*
         * We can seamlessly get a Scala first-class function and call it
         * by explicitly invoking the .apply() method defined on it. Further,
         * we can pass this as a value onto other functions, such as the one
         * defined in Clojure.
         */
        Function1<String, ?> scalaFunction = Scalable.someFunction();
        scalaFunction.apply("String from Java");
        parens.callThreeTimes(scalaFunction);

        /*
         * Mutable objects can also be created and passed around freely. It's important
         * to remember that there's no distinction between the notion of an "object" in
         * the different languages. Here, we put the Scala object's None and
         * Scalable.SomethingBrilliant, as well as a Clojure list, into a Java interop.Box
         * container object with no issues.
         */
        Box box1 = new Box("box1", None$.MODULE$);
        box1.identifyObject();
        parens.putListInBox(box1);
        box1.identifyObject();
        Box newBox = Scalable.duplicateBox(box1);
        newBox.setObject(Scalable.SomethingBrilliant$.MODULE$);
        newBox.identifyObject();
        box1.identifyObject();

    }

}
