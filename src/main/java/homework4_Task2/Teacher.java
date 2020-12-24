package homework4_Task2;

import java.util.Random;

public class Teacher extends Visitor{
    private String subject;
    private int id;
    private static String[] allowedSubjects = new String[] {"астрономия", "вышмат", "английский",
            "философия", "литература", "физика",
            "химия", "алгоритмика", "информатика",
            "право", "всемирная история", "физра"};

    public Teacher(int visitorAge, String visitorName, String subject) {
        this.visitorName = visitorName;
        this.visitorAge = visitorAge;
        this.subject = subject;
        this.id = Visitor.id;
        Visitor.id++;
    }

    public Teacher() {
        subject = "астрономия";
    }

    public int getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void doWork() {
        System.out.println("Меня зовут " + this.visitorName +
                "\nЯ преподователь по предмету " + this.subject +
                ", смотрю чем занимаются студенты. Мне " + this.visitorAge);
    }

    @Override
    public Visitor generateRandomVisitor() {
        int randomNameIndex = new Random().nextInt(9);
        int randomSubjectIndex = new Random().nextInt(11);
        int randomAge = (int) ((Math.random() * 70) + 30);

        return new Teacher(randomAge, Visitor.allowedNames[randomNameIndex], Teacher.allowedSubjects[randomSubjectIndex]);
    }
}
