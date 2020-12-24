package homework4_Task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static public Visitor randomVisitor(int visitorType){
        Visitor randomVisitor;
        if (visitorType % 2 == 0){
            randomVisitor = new Student().generateRandomVisitor();
        } else {
            randomVisitor = new Teacher().generateRandomVisitor();
        }

        return randomVisitor;
    }

    public static void main(String[] args) {
        ArrayList<Visitor> emptyList = new ArrayList<>();
        Library library = new Library(emptyList);
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Чтобы внести случайного посетителя введите [0],
                чтобы внести собственного посетителя введите [1],
                в ином случае просто нажмите Enter
                """);
        int is_receive = scanner.nextInt();

        if (is_receive == 0){
            System.out.println("Сколько посеителей пришло?");
            int howManyVisitors = scanner.nextInt();

            for (int i = 0; i < howManyVisitors; i++){
                library.receiveVisitor(Main.randomVisitor((int) (Math.random()*10)));
            }

            System.out.println("Не забывайте носить маску!!!1!");

        } else if (is_receive == 1) {
            System.out.println("Студент [0] или преподователь [1]?");
            int visitorType = scanner.nextInt();

            Visitor newVisitor = new Student();

            if (visitorType == 0){
                System.out.println("Сколько лет? Да, неприлично, но это останется между нами, честно...");
                int studentAge = scanner.nextInt();

                System.out.println("Как зовут?");
                String studentName = scanner.nextLine();

                System.out.println("Какой курс? [цифра]");
                int studentCourse = scanner.nextInt();

                newVisitor = new Student(studentAge, studentName, studentCourse);

            } else {
                System.out.println("Сколько Вам?");
                int teacherAge = scanner.nextInt();

                System.out.println("Как вас зовут?");
                String teacherName = scanner.nextLine();

                System.out.println("Какой предмет преподаете?");
                String teacherSubject = scanner.nextLine();


                newVisitor = new Teacher(teacherAge, teacherName, teacherSubject);
            }
            System.out.println("Не забывайте носить маску!!!1!");
            library.receiveVisitor(newVisitor);
        }

        System.out.println("Ну, что же... пора посмотреть кто сегодня 'отжигает' в библиотеке...");
        System.out.println("-----------------------------------------------------------------------");

        for (Visitor visitor : library.studentsAndTeachers){
            library.serve(visitor);
            System.out.println("-----------------------------------------------------------------------");
        }
    }
}
