package homework5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Jack", "Smith");
        System.out.println(u1.age);

        User.MyName(u1.firstName);
        System.out.println("My year of birth is "+User.yearOfBirth(15));

        User.generateRandomUsers(5,10,60);
    }
}
