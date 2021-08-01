package annotations;

public class Parent {
    public void someMethod() {

    }

    @Deprecated
    public void otherMethod() {
        System.out.println("Doing old stuff...");
    }
}
