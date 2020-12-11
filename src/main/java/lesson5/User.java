package lesson5;

import java.util.Scanner;

public class User {

    public int age;
    public String firstName;
    public String lastName;


    public String FirstName(){
        return firstName;
    }

    public String LastName(){
        return lastName;
    }

    public int Age(){
        Scanner scanner = new Scanner("age: ");
        age = scanner.nextInt();
        return age;
    }

    public User(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        return;
    }

    @Override
    public String toString() {
        return "I am " + firstName + ' ' + lastName + ' ' + age + " years old";
    }

    public String toTable() {
        return String.format("| %-15s| %-11s| %2d  |", firstName, lastName, age);
    }
}

