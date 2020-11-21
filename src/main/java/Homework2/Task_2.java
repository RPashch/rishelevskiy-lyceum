package Homework2;

import java.util.Arrays;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array_of_ints = new int[10];
        for (int i = 0; i < 10; ++i){
            array_of_ints[i] = random.nextInt();
        }
        System.out.println("Массив изначально: " + Arrays.toString(array_of_ints));
        for (int i = 10; i > 0; --i) {
            int last_elem = array_of_ints[0];
            for (int j = 1; j < i; ++j){
                if (last_elem > array_of_ints[j]){
                    array_of_ints[j - 1] = array_of_ints[j];
                    array_of_ints[j] = last_elem;
                }
                last_elem = array_of_ints[j];
            }
            System.out.println(Arrays.toString(array_of_ints));
        }
    }
}