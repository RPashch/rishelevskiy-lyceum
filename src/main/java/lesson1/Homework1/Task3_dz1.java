package lesson1.Homework1;

import java.util.Scanner;

public class Task3_dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  b если вы парень или g – если девушка, или n–если вы не уверены кто вы вообще.");
        String s1 = sc.nextLine();
        switch (s1){
            case "b":
                System.out.println("ну здорова, приятель");
                break;
            case "g":
                System.out.println("привет, как дела?");
                break;
            case "n":
                System.out.println("добрый день");
                break;
            default:
                System.out.println("вы точно человек?");
        }
    }
}
