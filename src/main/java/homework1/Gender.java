package homework1;

import java.util.Scanner;

public class Gender {
    public static void main(String[] args) {
        System.out.println("Ваш пол, пожалуйста:  (м; ж; н)");
        String sex = new Scanner(System.in).nextLine().toLowerCase();

        switch (sex){
            case "м" -> System.out.println("Добри день, пане!");
            case "ж" -> System.out.println("Привет, красотка!");
            case "н" -> System.out.println("Здравствуйте.");
            default -> System.out.println("Вы не чело..... кхе кхе... не бинарная персона!!!");
        }
    }
}
