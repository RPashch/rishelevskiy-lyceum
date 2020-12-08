package lesson1.Homework1;

import java.util.Scanner;

public class Task2_dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Радиус круга(м):");
        float r = sc.nextInt();
        double S;
        double pi;
        pi = 3.14;
        S = Math.pow(r, 2) * pi;
        System.out.println("Площадь круга с радиусом "+r+"(м) равна "+S+"(м^2)");

    }
}
