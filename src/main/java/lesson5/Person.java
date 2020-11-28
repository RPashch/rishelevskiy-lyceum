package lesson5;

public class Person {
    static int personCounter = 0;
    int id;
    int age;
    String name;

    public Person(int age, String name) {
        this.id = personCounter;
        this.age = age;
        this.name = name;
        personCounter++;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    static void printClassName() {
        System.out.println("Class: Person");
    }
}
