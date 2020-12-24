package homework1;

import java.util.Scanner;

public class Gender {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ваш пол? (М, Ж, Н)");
        String str = sc.nextLine().toLowerCase();

        switch (str){
            case "м" -> System.out.println("Добри день, пане");
            case "ж" -> System.out.println("Привет, красотка!");
            case "н" -> System.out.println("Здрасте...э...да..");
            case "ламинат" -> System.out.println("А ты шутник)))))");
            default -> System.out.println("Вы не чело...кхе.. не бинарная персона!!!");
        }

    }
}