//package TasksForHomework;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter ur dogs age(years):");
        int ageYears = s1.nextInt();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter ur dogs age(months):");
        int ageMonths = s2.nextInt();

        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter the number of years:");
        int years = s3.nextInt();

        int answer = years + ageYears;
        if (answer<5) {
            System.out.println("Oh, u have a puppy! It's not even 5, it's only " + ageYears +" years old.");
        }else{
            System.out.println("In " + years+ " years ur dog will be " + answer +" years and " + ageMonths + " months old.");
        }
    }
}