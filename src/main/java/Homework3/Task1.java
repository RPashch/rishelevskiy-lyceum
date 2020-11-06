package Homework3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] Arr = new int[n];

        System.out.println("Массив: ");
        for (int i = 0; i < Arr.length; i++) {
            //Arr[i] =  0 + (int) (Math.random() * Integer.MAX_VALUE);

            //Случайные значения от 0 до 100
            Arr[i] = 0 + (int) (Math.random() * 100);

            System.out.print(Arr[i] + " ");
            sum += Arr[i];
        }
        System.out.println("\nСумма чисел массива = " + sum);
    }
}
