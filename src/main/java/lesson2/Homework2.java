package lesson2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        System.out.println("Введите радиус:");
        Scanner r = new Scanner(System.in);
        double x=r.nextInt();
        double s;
        s=Math.PI*Math.pow(x,2);
        System.out.println("Площадь круга "+s+" квадратных единиц");
    }
}
