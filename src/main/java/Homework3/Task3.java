package Homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // element for work
        String el = "*";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of stars in first string: ");
        int count = sc.nextInt();
        // output
        String out = "";
        // while(! out.equals(el)) -- why does not it work?
        while (true) {
            // Work with output
            for (int j = 0; j < count; j++) {
                out += el;
            }
            System.out.print(out);
            // when we will have 1 el to output -> break the loop
            if (out.equals(el)){
                break;
            }
            // update the output for the next iteration
            out = "";
            count--;
            // go to next line
            System.out.println();
        }
    }
}
