package lesson2;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько лет вашей собаке сейчас?");
        int x = in.nextInt();
        System.out.println("Сколько месяцев вашей собаке сейчас?");
        int r = in.nextInt();
        System.out.println("Сколько лет вы хотите прибавить?");
        int y = in.nextInt();
        System.out.println("Сколько месяцев вы хотите прибавить?");
        int u = in.nextInt();
        int a, b;
        a = x + y;
        b = r + u;
        if ((a + (b / 12)) < 5) { System.out.println("Так у вас же ещё щенок! Ему и 5 лет даже нет-ему всего лишь " + x + " годика"); }
        else { System.out.println("Через " + y + " лет и " + u + " месяцев вашей собаке будет " + (a + b / 12) + " лет и " + (b % 12) + " месяцев"); }
    }
}