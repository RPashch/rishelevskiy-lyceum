package lesson1.Homework1;

import java.util.Scanner;

public class Task1_dz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Возраст собаки:");
        int dog_age = sc.nextInt();
        Scanner sc_y = new Scanner(System.in);
        System.out.println("Кол-во лет:");
        int years = sc_y.nextInt();
        Scanner sc_z = new Scanner(System.in);
        System.out.println("Кол-во месяцев:");
        int months = sc_z.nextInt();
        int sum;
        sum = dog_age + years;
        if (sum>5){
            System.out.println("Через "+ years +" и " + months + "месяцев лет вашей собаке будет "+sum+" лет и " + months + "месяцев");
        }
        else{
            System.out.println("Так у вас же ещё щенок! Ему и 5 лет даже нету – ему всего лишь "+sum+" годик(а)");
        }

    }
}
