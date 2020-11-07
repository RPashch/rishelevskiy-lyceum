package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter the length of the array:");
	    int n = new Scanner(System.in).nextInt();
	    int S = 0;
	    Random randInt = new Random();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = randInt.nextInt(100);
            S += array[i];
        }

        System.out.println("Sum is: " + S);
    }

}
