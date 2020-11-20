package Homework_Class;

import java.time.LocalDate;

public class User {
    String firstName;
    String lastName;
    int age;

    public User(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    User(String lastName, String firstName)
    {
        this(firstName, lastName, 0);
    }

    void UserName()
    {
        System.out.println("My name is "+firstName+" "+lastName);
    }

    public int getUserYear()
    {
        LocalDate currentdate = LocalDate.now();
        int currentYear = currentdate.getYear();
        return (currentYear - age);
    }

    void OutAge()
    {
        System.out.println("Введите границы возраста:");
    }
    void OutQuantity()
    {
        System.out.println("Введите количество пользователей:");
    }
}
