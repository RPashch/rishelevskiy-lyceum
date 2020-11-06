package Homework3;

import java.util.Random;

public class Task2_2 {
    public static void main(String[] args) {
// Create and print array
        System.out.println("Array: ");
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n\nProcess: ");
        // method sort
        sort(arr, arr.length);
        // print sorted array
        System.out.println("\nSorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }


    }
// method sort
    static void sort(int[] arr, int len) {
        // check for finishing of a recursive method
        if (len == 1) {
            return;
        }

        // common bubble sort algorithm
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int n = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = n;
            }
        }
        // print the array at each loop/method iteration
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // recursion
        sort(arr, len - 1);
        // len become smaller, to exit the recursive method
        // but can i use something more effectively?
        // because in last 3 func iterations array have already sorted,
        // but the function still works.
    }
}
