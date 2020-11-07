package homework3;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] arr = new int[10];
        for (int i = 0; i < 10; ++i){
            arr[i] = r.nextInt(100);
        }

        for (int n = 9; n > 0; --n){
            for (int i = 0; i < n; ++i){
                if (arr[i] > arr[i+1]) {
                    int x = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = x;
                }
            }
            for (int i = 0; i < 10; ++i){
                System.out.print(arr[i] + " ");
            }
            System.out.print("\n");
        }
    }
}

