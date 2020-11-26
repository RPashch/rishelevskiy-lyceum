package homeworks;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("k = ");
        int k = sc.nextByte();

        switch(k) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;

        }
    }
}
