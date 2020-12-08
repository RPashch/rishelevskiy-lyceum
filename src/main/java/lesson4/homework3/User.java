package lesson4.homework3;
import java.time.LocalDate;
public class User {
    String firstName;
    String lastName;
    int age;
    LocalDate date = LocalDate.now();
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    User(String lastName, String firstName) {
        this(firstName, lastName, 0);
    }
    public void print_User_name(User User){
        System.out.println("My name is " + User.firstName);
    }
    public void print_User_age(User User){
        System.out.println(date.getYear() - User.age);
    }
}
