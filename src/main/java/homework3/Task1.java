package homework3;
import java.util.Scanner;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = sc.nextInt();

        int [] arr = new int[num];

        int sum = 0;

        for (int i = 0; i < num; ++i) {
            arr[i] = random.nextInt(100);
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
