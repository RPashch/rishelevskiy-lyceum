package lesson5;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person(15, "Denis");

        System.out.println(p1.id);
        System.out.println(p1.age);
        System.out.println(p1.name);

        Person p2 = new Person(16, "Artyom");

        System.out.println(p2.id);
        System.out.println(p2.age);
        System.out.println(p2.name);

        System.out.println(Person.personCounter);
        Person.printClassName();
    }
}
