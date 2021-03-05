package com.company;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Enter the side of a square:");
        int len = new Scanner(System.in).nextInt();
        int[] array = new int[len];
        String side = "";

        for (int i = array.length-1; i>0; i--){
            array[i] = i+1;
        }

        int sideLen = array[array.length-1];

        for (int i = sideLen; i>0; i--){
            for (int k = sideLen; k>0; k--){
                side += "**";   //две звездочки, потому что решил, что так больше на квадрат похоже ахах
            }
            System.out.println(side);
            side = "";
        }

    }

}
