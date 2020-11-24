package Homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner quan = new Scanner(System.in);
        int quantity = quan.nextInt();
        String[][] stars = new String[quantity][quantity];

        for (int j = 0; j < stars.length; j++) {
            for (int i = 0; i < stars.length; i++) {
                stars[j][i] = "*";
                System.out.print(stars[j][i]);
            }
            System.out.print(" " + "\n");
        }
    }
}