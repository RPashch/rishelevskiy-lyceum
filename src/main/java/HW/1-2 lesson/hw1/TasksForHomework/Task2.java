import java.util.Scanner;
import java.lang.Math;

public class Task2 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double R = s1.nextInt();

        double S = 3.14 * Math.pow(R, 2);
        System.out.println("The circles' square is " + S);
    }
}