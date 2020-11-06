package homework2;

import java.util.Scanner;

public class Number_4 {
    public static void main(String[] args) {
        System.out.println("Длина стороны квадрата: ");
        int len_sq = new Scanner(System.in).nextInt();

        for (int i = 0; i < len_sq; i++){
            for (int j = 0; j < len_sq; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
