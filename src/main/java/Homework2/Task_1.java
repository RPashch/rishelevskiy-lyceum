package Homework2;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        long sum = 0;
        long[] array_of_longs = new long[len];

        for (int i = 0; i < len; ++i) {
            array_of_longs[i] = Math.abs(random.nextInt());
        }

        for (int i = 0; i < len; ++i) {
            sum += array_of_longs[i];
        }

        System.out.println("Сумма всех чисел в массиве: " + sum);
    }
}