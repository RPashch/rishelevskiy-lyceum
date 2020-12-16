package lesson4.homework3;

public class Main {
    public static void main(String[] args) {
        User Ivan = new User("Ivan","Shevchenko",20);
        User Ostap = new User("Ostap","Srezko");
        Ostap.print_User_name(Ostap);
        Ivan.print_User_age(Ivan);
    }
}
