package Homework2_array_for;

import java.util.Scanner;

public class array_for_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = 0;

        System.out.print("Введите длину стороный квадрата: ");
        int storona = scan.nextInt();

        for (int i=0; i<storona; i++)
        {
            while(b!=storona)
            {
                System.out.print("*");
                b+=1;
            }
            b=0;
            System.out.println();
        }
    }
}
