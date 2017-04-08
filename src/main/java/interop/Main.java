
package interop;

import interop.parens;
import interop.Scalable;
import scala.Function1;
import scala.None$;

public class Main {

    public static void main(String[] args) {
        System.out.println("I'm in the Java main method.");

        parens.sayHello();
        Scalable.sayHello();

        Function1<String, ?> scalaFunction = Scalable.someFunction();
        scalaFunction.apply("String from Java");
        parens.callThreeTimes(scalaFunction);

        Box box1 = new Box("box1", None$.MODULE$);
        box1.identifyObject();
        parens.putListInBox(box1);
        box1.identifyObject();
        Box newBox = Scalable.duplicateBox(box1, Scalable.SomethingBrilliant$.MODULE$);
        newBox.identifyObject();
        box1.identifyObject();

    }

}
