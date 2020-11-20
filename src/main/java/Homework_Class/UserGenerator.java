package Homework_Class;

import java.util.Random;
import java.util.Scanner;

public class UserGenerator {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    String[] firstRandomName = {"Nikita", "Dimitriy", "Roman", "Kirilyuha", "Abdulina", "Mohammedina", "Artyom", "Sanya", "Konstantin", "WhatIsLove"};
    String[] lastRandomName = {"Ivanov", "Bochkaryov", "Popov", "Petrov", "Lebedev", "Juravlyov", "Logvinov", "Pryadko", "Ottovordemgentschenfelde", "Sosiska"};

    int deepAge = scan.nextInt();
    int topAge = scan.nextInt();
    int quantity = scan.nextInt()*3;
    int max = 0;
    int indexOldest = 0;

    public void generateRandomUsers()
    {
        String[] RandomUsers = new String[quantity];

        for (int i=0; i<quantity; i+=3)
        {
            int firstRandomNameIndex = (int) (Math.random()* firstRandomName.length);
            int lastRandomNameIndex = (int) (Math.random()* lastRandomName.length);
            int RandomAge = (int)( Math.random()*(topAge-deepAge) + deepAge);

            RandomUsers[i] = firstRandomName[firstRandomNameIndex];
            RandomUsers[i+1] = lastRandomName[lastRandomNameIndex];
            RandomUsers[i+2] = Integer.toString(RandomAge);
        }

        System.out.println("-----------------------------------------------------------------");
        System.out.println("| First Name          | Last Name                         | Age |");
        System.out.println("-----------------------------------------------------------------");

        for (int i=0; i<quantity; i+=3)
        {
            System.out.printf("| %-20s|", RandomUsers[i]);
            System.out.printf(" %-34s|", RandomUsers[i+1]);
            System.out.printf(" %-3s|%n", RandomUsers[i+2]);
        }

        System.out.println("-----------------------------------------------------------------");

        for (int i=0; i<quantity; i+=3)
        {
            int c = Integer.parseInt(RandomUsers[i+2]);
            if (c>max)
            {
                max = c;
                indexOldest = i;
            }
        }

        System.out.println(RandomUsers[indexOldest]+" "+RandomUsers[indexOldest+1]+" "+RandomUsers[indexOldest+2]+" I'm the oldest here");

        User user = new User(RandomUsers[indexOldest], RandomUsers[indexOldest+1], Integer. parseInt(RandomUsers[indexOldest+2]));


        System.out.print("He/she was born in "+user.getUserYear());
    }
}
