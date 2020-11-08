package Homework2_array_for;

import java.util.Random;

public class array_for_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i=0; i< array.length; i++)
        {
            array[i] = random.nextInt(Integer.MAX_VALUE); //Заполнение массива
            System.out.println(array[i]);
        }

        System.out.println("Граница"); //Выше будет вывод изначального массива, ниже - после сортировки

        for (int i = 0; i < array.length - 1; i++) //Внутренний проход цикла
        {
            for (int j = array.length - 1; j > i; j--) //Проход с конца
            {
                if (array[j - 1] > array[j]) //Переприсваивание
                {
                    int ch = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = ch;
                }
            }
            System.out.println(array[i]);
        }
    }
}
