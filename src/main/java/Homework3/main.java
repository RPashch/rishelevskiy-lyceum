package Homework3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во пользователей, которых хотите сгенерировать:");
        int count_users = sc.nextInt();
        System.out.println("Введите нижнюю границу возрастов:");
        int lower_age_limit = sc.nextInt();
        System.out.println("Введите верхнюю границу возрастов:");
        int upper_age_limit = sc.nextInt();
        System.out.println("Вы хотите переписать допустимые имена и фамилии? (Введите 1 если да, 0 если нет)");
        int answer = sc.nextInt();
        String[] first_names;
        String[] second_names;
        if (answer == 1) {
            System.out.println("Введите имена через пробел: ");
            first_names = sc.nextLine().split(" ");
            System.out.println("Введите фамиллии через пробел: ");
            second_names = sc.nextLine().split(" ");
        } else {
            first_names = new String[]{"Дубинин", "Белочкин", "Богомазов", "Аверьянов", "Драгомиров", "Безбородов", "Ювелев", "Моисеев", "Ломовцев", "Мухоморов"};
            second_names = new String[]{"Аникита", "Ксанф", "Витольд", "Гастон", "Дамир", "Северин", "Тит", "Владимир", "Севастьян", "Валентин"};
        }
        UserGenerator list_of_users = new UserGenerator(count_users, first_names, second_names, lower_age_limit, upper_age_limit);
        System.out.println(list_of_users.toString());
        System.out.println(list_of_users.oldest_user());
        System.out.println("\nПервый пользователь");
        System.out.println(list_of_users.users[0].getYearOfBirth());
    }
}
