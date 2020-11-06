package homework2;

import java.util.Scanner;

public class Number_1 {
    public static void main(String[] args) {
        System.out.println("Сколько элементов в массиве?");
        int len_A = new Scanner(System.in).nextInt();
        int sum = 0;
        int[] A = new int[len_A];

        for (int i = 0; i < len_A; i++) {
            A[i] = (int) (Math.random() * 10);
            sum += A[i];
            System.out.print(A[i] + " ");
        }

        System.out.println("\nСумма элементов: " + sum);
    }
}
