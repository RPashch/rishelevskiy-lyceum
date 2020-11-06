package homework1;

import java.util.Scanner;

public class Circle {
    public Circle() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Радиус круга: ");
        double r = sc.nextDouble();
        double S = Math.PI * Math.pow(r, 2);
        System.out.println("Площадь круга: " + Math.round(S));
    }
}
