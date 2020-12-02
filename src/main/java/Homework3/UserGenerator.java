package Homework3;

import java.util.Random;

public class UserGenerator {
    User[] users;
    private int upper_age_limit;

    public UserGenerator(int count_of_users, String[] first_names, String[] second_names, int lower_age_limit, int upper_age_limit) {
        this.upper_age_limit = upper_age_limit;
        Random random = new Random();
        User[] users = new User[count_of_users];
        for (int i = 0; i < count_of_users; i++) {
            users[i] = new User(first_names[random.nextInt(first_names.length)], second_names[random.nextInt(second_names.length)], (int) (Math.random() * ((upper_age_limit - lower_age_limit) + 1)) + lower_age_limit);
        }
        this.users = users;

    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int max_len_name = 10;
        int max_len_last_name = 9;
        int max_len_age = 3;
        if (String.valueOf(upper_age_limit).length() > max_len_age){
            max_len_age = String.valueOf(upper_age_limit).length();
        }
//        Operationable operation;
//        operation = (User[] users, parametr) -> for (int i = 0; i < users.length; i++) {
        for (User user : users) {
            if (user.getFirstName().length() > max_len_name) {
                max_len_name = user.getFirstName().length();
            }
            if (user.getLastName().length() > max_len_last_name) {
                max_len_last_name = user.getLastName().length();
            }
        }
        result.append("-".repeat(max_len_age + max_len_last_name + max_len_name + 10));
        result.append("\n| First Name");
        result.append(" ".repeat(max_len_name - 10));
        result.append(" | Last Name");
        result.append(" ".repeat(max_len_last_name - 9));
        result.append(" | Age |\n");
        result.append("-".repeat(max_len_age + max_len_last_name + max_len_name + 10)).append("\n");
        for (User user: users) {
            result.append("| ").append(user.getFirstName()).append(" ".repeat(max_len_name - user.getFirstName().length()));
            result.append(" | ").append(user.getLastName()).append(" ".repeat(max_len_last_name - user.getLastName().length()));
            result.append(" | ").append(user.getAge()).append(" ".repeat(3 - String.valueOf(user.getAge()).length())).append(" |").append("\n");
        }
        result.append("-".repeat(max_len_age + max_len_last_name + max_len_name + 10));
        return result.toString();
//    }
    }

    public String oldest_user() {
        int max = 0;
        User oldest_user = null;
        for (User user : users) {
            if (user.getAge() > max) {
                max = user.getAge();
                oldest_user = user;
            }
        }
        assert oldest_user != null;
        return "Имя: " + oldest_user.getFirstName() + "\nФамилиия: " + oldest_user.getLastName() + "\nВозраст: " + oldest_user.getAge() + " \nI'm the oldest user here";
    }
}
