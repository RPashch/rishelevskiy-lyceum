package Homework2_array_for;

import java.util.Random;
import java.util.Scanner;

public class array_for_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите количество элементов массива:");


        int kol = scan.nextInt();
        int array[] = new int[kol];
        int sum = 0;

        for (int i=0; i< array.length; i++)
        {
            array[i] = random.nextInt(Integer.MAX_VALUE)+1;
            sum = sum + array[i];
        }

        System.out.println(sum);
    }

}

