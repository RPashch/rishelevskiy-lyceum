package Homework_Class;

public class Name {
    public static void main(String[] args) {

        System.out.println("Введите границы возраста(от меньшего) и количество пользователей:");

        UserGenerator u1 = new UserGenerator();
        u1.generateRandomUsers();

    }
}
