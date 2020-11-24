package lesson2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Введите пол:");
        Scanner r = new Scanner(System.in);
        String s = r.nextLine();
        if (s.equals("b")) { System.out.println("ну здорова, приятель"); }
        else
            if (s.equals("g")) { System.out.println("привет,как дела?"); }
        else
            if (s.equals("n")) { System.out.println("добрый день"); }
        else { System.out.println("Вы точно человек?"); }
    }
}
