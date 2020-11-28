package homework5;

public class User {
    String firstName;
    String lastName;
    int age;

    public User(String fN, String lN, int age) {
        this.firstName = fN;
        this.lastName = lN;
        this.age = age;
    }

    public User(String fN, String lN) {
        this.firstName = fN;
        this.lastName = lN;
        this.age = 0;
    }

    static void MyName(String name) {
        System.out.println("My name is " + name);
    }

    static int yearOfBirth (int age) {
        int year = 2020 - age;
        return year;
    }

    static void generateRandomUsers(int n, int minAge, int maxAge) {
        String [] users = new String[n];
        int [] age = new int[n];
        int max = 0;
        int number = -1;

        for (int i = 0; i < n; ++i) {
            users[i] = UserGenerator.RandomFirstName() + " " + UserGenerator.
                    RandomLastName();
            age[i] = UserGenerator.RandomAge(minAge, maxAge) + minAge;
            System.out.println(users[i] + ", age: " + age[i]);
            if (age[i] > max) {
                max = age[i];
                number = i;
            }
        }
        System.out.println("My name is "+users[number]+" and I am oldest here.");
    }
}
