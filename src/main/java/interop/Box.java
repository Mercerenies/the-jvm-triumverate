
package interop;

public class Box {

    private String name;
    private Object object;

    public Box(String name, Object object) {
        this.name = name;
        this.object = object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void identifyObject() {
        System.out.println("Currently, the object in " + name + " is " + getObject());
    }

}
