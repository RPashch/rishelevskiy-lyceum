package lesson2.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task3_hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Длина массива:");
        int n = sc.nextInt();
        String arr[];
        arr = new String[n];
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < n; i++) {
            arr[i] = "*";
        }
        System.out.println(Arrays.toString(arr));
        for(int i = n; i > 0; i--) {
            arr[i-1] = "";
            System.out.println(Arrays.toString(arr));
        }


        }

    }

