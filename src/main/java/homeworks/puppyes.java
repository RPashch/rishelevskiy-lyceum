package homeworks;

import java.util.Scanner;

public class puppyes {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.print("Сколько лет вашей собаке сейчас?: ");
        int a = age.nextInt();

        Scanner mon = new Scanner(System.in);
        System.out.print("Сколько месяцев вашей собаке сейчас?: ");
        int m = mon.nextInt();

        Scanner year = new Scanner(System.in);
        System.out.print("Сколько лет вы хотите прибавить?: ");
        int y = year.nextInt();

        Scanner month = new Scanner(System.in);
        System.out.print("Сколько месяцев вы хотите прибавить?: ");
        int mn = month.nextInt();

        if (a < 5) {
            System.out.println("Так у вас же ещё щенок! Ему и 5 лет даже нету – ему всего лишь " + a + " годика.");
        }

            int sum = a + y;
        int mnsum = mn + m;
        int plusyear = 0;
        if (mnsum >= 10){
            plusyear = 1;
        }
        int mm = 0;
        int readymm = mnsum%10;
        int suma = sum + plusyear;

        System.out.println("вашему псу будет " + suma + " лет и " + readymm + " месяцев");

        }
    }

