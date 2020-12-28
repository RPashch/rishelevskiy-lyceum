package Homework_6;

public class Visitor {

    private String name;
    private int age;
    private static int id = 0;

    public Visitor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setId(int id) {
        Visitor.id = id;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void doWork() {

    }
}

class Student extends Visitor {
    int course;

    public Student(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    public void doWork() {
        System.out.printf("Я - студент %s курса ищу новые книги.",course);
    }
}

class Teacher extends Visitor {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void doWork() {
        System.out.printf("Я - преподаватель предмета %s - слежу за студентами.",subject);
    }
}

