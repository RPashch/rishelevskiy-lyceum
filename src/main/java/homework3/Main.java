package homework3;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] mainFirstNamesList = new String[] {"Nikita", "Jolyn", "Joseph", "Pasha", "Roman", "Dio", "Jean-Pierre", "Jotaro", "Alexandra", "Kirill"};
        String[] mainLastNamesList = new String[] {"Bochakev", "Kujo", "Joestar", "Brando", "Polnareff", "Logvinov", "Mellstroy", "Pryadko", "Sokolov", "Black"};

        System.out.println("Enter deep age:");
        int usersDeepAge = new Scanner(System.in).nextInt();

        System.out.println("Enter top age:");
        int usersTopAge = new Scanner(System.in).nextInt();

        UserGenerator ug = new UserGenerator(mainFirstNamesList, mainLastNamesList, usersDeepAge, usersTopAge);

        System.out.println("Users to generate:");
        int usersNumber = new Scanner(System.in).nextInt();

        User[] randomUsers = ug.generateRandomUsers(usersNumber);

        System.out.println("------------------------------------\n|  First Name  |  Last Name  | Age |\n------------------------------------");

        for (User user : randomUsers){
            System.out.printf("| %-13s|", user.firstName);
            System.out.printf(" %-12s|", user.lastName);
            System.out.printf(" %-4d|%n", user.age);
        }

        System.out.println("------------------------------------");

        User oldestUser = ug.oldestUser(randomUsers);
        System.out.println("The oldest user is " + oldestUser.firstName + " " + oldestUser.lastName + "\nHe/she is " + oldestUser.age + "!!!");
    }
}

class User {
    String firstName;
    String lastName;
    int age;

    User(String f_Name, String l_Name, int a)
    {
        firstName = f_Name;
        lastName = l_Name;
        age = a;
    }

//    User(String f_Name, String l_Name)
//    {
//        firstName = f_Name;
//        lastName = l_Name;
//        age = 0;
//    }

    User()
    {
        this(" ", " ", 0);
    }

    public void userName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }

    public int userBirthYear(){
        int currentyear = LocalDate.now().getYear();
        return (currentyear - this.age);
    }
}

class UserGenerator {
    String[] firstNamesList = new String[10];
    String[] lastNamesList = new String[10];
    int deepAge, topAge;

    public User[] generateRandomUsers(int usersNumber) {
        User[] randomUsers = new User[usersNumber];

        for (int i = 0; i < usersNumber; i++){
            int randFirstNameIndex = new Random().nextInt(9);
            int randLastNameIndex = new Random().nextInt(9);
            int randAge = (int) ((Math.random()*(topAge - deepAge)) + deepAge);

            randomUsers[i] = new User(firstNamesList[randFirstNameIndex], lastNamesList[randLastNameIndex], randAge);
        }
        return randomUsers;
    }

    public User oldestUser(User[] randomUsers){
        User oldestUser = new User();
        int maxAge = 0;

        for (User user : randomUsers){
            if (user.age > maxAge){
                oldestUser = user;
                maxAge = user.age;
            }
        }
        return oldestUser;
    }

    public UserGenerator(String[] firstNamesList, String[] lastNamesList, int deepAge, int topAge) {
        this.firstNamesList = firstNamesList;
        this.lastNamesList = lastNamesList;
        this.deepAge = deepAge;
        this.topAge = topAge;
    }


}
