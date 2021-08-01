package annotations;

public class Child extends Parent {

    @Override
    public void someMethod() {
        System.out.println("Overriding method from the parent class");
    }
}
