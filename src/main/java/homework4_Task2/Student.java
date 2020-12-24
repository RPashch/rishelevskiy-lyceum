package homework4_Task2;

import java.util.Random;

public class Student extends Visitor{
    int course;
    int id;

    public Student(int visitorAge, String visitorName, int course) {
        this.visitorAge = visitorAge;
        this.visitorName = visitorName;
        this.course = course;
        this.id = Visitor.id;
        Visitor.id++;
    }

    public Student(int course) {
        this.course = course;
    }

    public Student(){
        course = 1;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public void doWork(){
        System.out.println("Я "+ this.visitorName +
                ", в свои " + this.visitorAge +
                " студент " + this.course + " курса, пытаюсь найти полезную информацию.");
    }

    @Override
    public Student generateRandomVisitor() {
        int randomNameIndex = new Random().nextInt(9);
        int randomAge = (int) ((Math.random() * 14) + 16);
        int randomCourse = (int) ((Math.random() * 4) + 1);

        return new Student(randomAge, Visitor.allowedNames[randomNameIndex], randomCourse);
    }
}
