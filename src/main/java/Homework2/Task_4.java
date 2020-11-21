package Homework2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину строки: ");
        int len = sc.nextInt();
        for (int i = 0; i < len; ++i){
            System.out.println("*".repeat(len));
        }
    }
}