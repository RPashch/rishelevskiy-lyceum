package homework5;

import java.util.Random;

public class UserGenerator {
    static String [] firstNames = {"Anna", "Mary", "Jane", "Kate", "Emily",
            "John", "Mike", "Bill", "Joseph", "Pitt"};
    static String [] lastNames = {"Jones", "Williams", "Davis", "Wilson",
            "Harris", "Clark", "Walker", "Scott", "Adams", "Carter"};

    public static String RandomFirstName() {
        Random random = new Random();
        int r = random.nextInt(10);
        return firstNames[r];
    }

    public static String RandomLastName() {
        Random random = new Random();
        int r = random.nextInt(10);
        return lastNames[r];
    }

    public static int RandomAge(int minAge, int maxAge) {
        Random random = new Random();
        int age = random.nextInt(maxAge - minAge);
        return age;
    }
}
