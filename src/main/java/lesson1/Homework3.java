package lesson1;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Sex?");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("b")){
            System.out.println("Ну здорова, приятель!");
        } else if(s.equals("g")){
            System.out.println("Привет, как дела? Может sex?");
        }else {
            System.out.println("Добрый день");
        }
    }
}