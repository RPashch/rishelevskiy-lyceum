package Homework2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int[] array = new int[quantity];
        int k=0;
        for(int i=0; i < quantity; i++)
        {
            array[i] = (int) (Math.random() * (10 - (1) + 1)) +(1);
            System.out.println(array[i]);
            k = array[i] + k;
        }
        System.out.println(k);
    }
}
