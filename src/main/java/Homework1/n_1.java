package Homework1;

import java.util.Scanner;

public class n_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько лет вашей собаке сейчас?");

        int x = in.nextInt();

        System.out.println("Сколько ему(ей) месяцев?");

        int z = in.nextInt();

        System.out.println("Сколько лет вы хотите прибавить?");

        int y = in.nextInt();

        System.out.println("Сколько месяцев вы хотите ему прибавить?");

        int f = in.nextInt();

        if(x+y<5)

            System.out.println("Так у вас же ещё щенок! Ему и 5 лет даже нету – ему всего лишь 3 годика.");

        else

        if(z==0 & f==0)

            System.out.print("Через "+y+" лет вашей собаке будет "+(x+y)+" лет");

        else

            System.out.printf("Через %d лет вашей собакет будет %d лет и %d месяцев",
                    y, (x+y+(f+z)/12), (f+z)%12 );
    }
}
