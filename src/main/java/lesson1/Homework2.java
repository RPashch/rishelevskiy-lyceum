package lesson1;

import java.util.Scanner;


public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Нужно ввести радиус: ");
        double r = sc.nextDouble();
        double S = Math.PI * Math.pow(r, 2);
        System.out.println("Площадь круга с радиусом " + r + " см = " + S + " см^2");
    }
}