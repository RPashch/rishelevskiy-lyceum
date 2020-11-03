package homework1;

import java.util.Scanner;

public class DogAge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько лет вашей собаке?");
        int age = sc.nextInt();

        System.out.println("Сколько месяцев вашей собаке?");
        int months = sc.nextInt();

        System.out.println("Сколько лет вы зотите прибавить?");
        int plus_age = sc.nextInt();

        System.out.println("Сколько месяцев прибавить?");
        int plus_months = sc.nextInt();

        int f_age = plus_age + age;
        int f_months = plus_months + months;

        if (f_months>12){
            f_age = f_age + (f_months/12);
            f_months = 12;
        }

        if (f_age<5) {
            System.out.println("Так у вас же ещё щенок! Ему и 5 лет даже нету – ему всего лишь "+age+" годика.");
        } else {
            System.out.println("Через "+plus_age+" лет и "+plus_months+" месяцев вашему песику\nбудет "+f_age+" лет и "+f_months+" месяцев");
        }

    }
}