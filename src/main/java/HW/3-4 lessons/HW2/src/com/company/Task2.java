package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Random randInt = new Random();
        int[] array = new int[10];
        String arrayString = "";
        String arrayCharacters = "";

        int more = 0;
        int less = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = randInt.nextInt(100);
        }

        for (int k = 0; k < array.length-1; k++){
            if (array[k] > array[k+1]){
                more = array[k];
                less = array[k+1];
                array[k+1] = more;
                array[k] = less;
            }else{
                array[k] = array[k];
                array[k+1] = array[k+1];
            }

            for (int x = 0; x < array.length; x++){
                if (x == array.length-1){
                    System.out.print(array[x] + ";\n");
                }else{
                    System.out.print(array[x] + ", ");
                }

            }

        }

        System.out.println("Max: " + array[array.length-1]);


    }

}
