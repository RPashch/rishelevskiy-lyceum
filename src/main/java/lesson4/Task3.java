package lesson4;

public class Task3 {

    public static void main(String[] args) {

        Child1 child1 = new Child1();
        child1.a = 2;
        System.out.println(child1.a);
        System.out.println(child1.b);
        System.out.println(child1.c);
    }

}

class Parent {
    int a;
    int b;
}

class Child1 extends Parent {
    int c;
}

// создать Child2 class который будет наследником Парента
// создать Child3 class который будет наследником Child1
// сделать метод в Parent class для суммирования a + b
// сделать int a and int b приватными

