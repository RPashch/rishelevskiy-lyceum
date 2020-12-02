package Homework3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void getName() {
        System.out.println("My name is " + this.firstName);
    }

    public String getYearOfBirth() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int year = Integer.parseInt(dateFormat.format(date));
        return "Год рождения: " + String.valueOf(year - this.age);
    }
}