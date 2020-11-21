package lesson2.Homework2;

import java.util.Scanner;
import java.util.Arrays;
public class Task2_hw2 {
    public static void main(String[] args) {
        int arr[];
        arr = new int[10];

        for(int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        }
    }

