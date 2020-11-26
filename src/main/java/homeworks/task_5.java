package homeworks;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input: ");
        String x = sc.nextLine();


        while (!x.equals("stop")) {
            System.out.println(x);
            x = sc.nextLine();

        }

        // сделать цикл при котором приложение закончит свою работу только тогда, когда пользователь ведёт слово stop
    }
}
