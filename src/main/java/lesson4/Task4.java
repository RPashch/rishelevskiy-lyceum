package lesson4;

public class Task4 {

    public static void main(String[] args) {
        Child child = new Child();

        child.method2();
        child.method();



        AbstractClass instance = new AbstractClass() {
            @Override
            void method2() {

            }
        };


    }

}

abstract class AbstractClass {
    int a = 100;

    void method() {
        System.out.println("simple method");
    }

    abstract void method2();

}

class Child extends AbstractClass {

    @Override
    void method2() {
        System.out.println("Override this");
    }
}