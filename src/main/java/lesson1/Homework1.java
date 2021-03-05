package lesson1;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст вашей собаки (лет): ");
        int x = sc.nextInt();
        System.out.println("А месяцев? ");
        int xM = sc.nextInt();
        System.out.println("Сколько вы хотите ей прибавить (лет): ");
        int y = sc.nextInt();
        System.out.println("Может еще добавите месяцев? ");
        int yM = sc.nextInt();

        int mY = 0;
        int mM = 0;

        if (xM + yM >= 12) {
            mY = (xM + yM) / 12;
            mM = (xM + yM) % 12;
        }
        int res = x + y + mY;

        if (res < 5) {
            System.out.println("Так у вас же ещё щенок! Ему и 5 лет даже нету – ему всего лишь " + res + " годика.");
        } else {
            System.out.println("Через " + y + " лет, и " + yM + " вашей собаке будет " + res + " лет и " + mM + " месяцев");
        }
    }
}
