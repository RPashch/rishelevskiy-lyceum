package Homework_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new Scanner(System.in);
        Scanner scan;
        String input;
        String subject;
        int course;
        int age;
        String name;

        System.out.println("Введите вместимость библиотеки.");
        int capacity = scanner.nextInt();

        Library library = new Library("Библиотека", capacity);

        System.out.println("Для того чтобы закончить создавать, напишите - 'Конец'");

        input = scanner.nextLine();

        while(!input.equals("Конец")){

            scanner = new Scanner(System.in);
            scan = new Scanner(System.in);

            System.out.println("Ученика или учителя?");

            input = scanner.nextLine();

            if(input.equals("Ученика")) {

                System.out.println("Впишите имя, возраст и курс");

                name = scanner.nextLine();

                age = scanner.nextInt();

                course = scanner.nextInt();

                Student student = new Student(name, age, course);

                System.out.println("Завести его в библиотеку?");

                if(scan.nextLine().equals("Да")){

                    library.receiveVisitor(student);

                }

            }

            if(input.equals("Учителя")){

                System.out.println("Впишите имя, возраст и предмет.");

                name = scanner.nextLine();

                age = scanner.nextInt();

                subject = scan.nextLine();

                Teacher teacher = new Teacher(name, age, subject);

                System.out.println("Отправить в библиотеку?");

                if(scan.nextLine().equals("Да")){

                    library.receiveVisitor(teacher);

                }

            }

            System.out.println("Конец?");
            input = scan.nextLine();

        }

        library.serve();

        library.randomStudent();
        
        library.randomTeacher();

    }

}

