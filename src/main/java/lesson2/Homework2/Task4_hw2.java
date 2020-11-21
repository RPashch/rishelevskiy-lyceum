package lesson2.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("сторона квадрата:");
        int n = sc.nextInt();
        String arr[];
        arr = new String[n];
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < n; i++) {
            arr[i] = "*";
        }
        for(int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
