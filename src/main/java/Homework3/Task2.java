// Как узнать время работы программы? тоесть
// здесь я использовал currentTimeMillis(),
// но как-то оно непонятно показывает, а на стак оверфлоу это
// самый популярный вариант, может просто я не разобрался с выводом

// Кол-во вложенных циклов тоже очень смущает..их 3..
// может стоило использовать рекурсивную функцию?

package Homework3;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nСортировка пузырьком: ");
        final double startTime = System.currentTimeMillis();
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int n = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = n;
                    System.out.println();
                    for (int f = 0; f < 10; f++) {
                        System.out.print(arr[f] + " ");
                    }
                }
            }
        }
        final double endTime = System.currentTimeMillis();

        System.out.println("\n\nTotal execution time: " + (endTime - startTime));
    }
}
