package Homework3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the side: ");
        int size = sc.nextInt();
        System.out.println("Element to output: ");
        String el = sc.next();
        System.out.println("Result: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(el);
            }
            System.out.println();
        }
    }
}
