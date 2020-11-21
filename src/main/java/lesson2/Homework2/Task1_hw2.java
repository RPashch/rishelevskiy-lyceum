package lesson2.Homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Длина массива:");
        int n = sc.nextInt();
        int c;
        c = 0;
        int arr[];
        arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = (int)( Math.random()*10);
            c += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(c);
    }
}
