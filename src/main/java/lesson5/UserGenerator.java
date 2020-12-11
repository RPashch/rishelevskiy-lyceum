package lesson5;

import java.util.Random;

public class UserGenerator {
    private final String names[];
    private final String lastNames[];
    private Random random = new Random();
    private int ageFrom;
    private int ageTo;

    public UserGenerator(String[] names, String[] lastNames, int ageFrom, int ageTo) {
        this.names = names;
        this.lastNames = lastNames;
        this.ageFrom = ageFrom;
        this.ageTo = ageTo;
    }

    public int getAccessibleAge() {
        int accessibleAge = ageFrom + random.nextInt(ageTo - ageFrom);
        return accessibleAge;
    }

    public String getRandomName() {
        int i = random.nextInt(names.length);
        String name = names[i];
        return name;
    }
    public String getRandomLastName(){
        int i = random.nextInt(lastNames.length);
        String lastName = lastNames[i];
        return lastName;
    }

    public User giveMeNextUser() {
        String name = getRandomName();
        String lastName = getRandomLastName();
        int age = getAccessibleAge();
        return new User(name, lastName, age);
    }


   /* public AccessibleAge(int accessibleAge){  //values from 14 to 20 years    // This is a BIG mistake
        if(accessibleAge > 14 && accessibleAge < 20){
            int MainaccessibleAge = (int)(14 + (Math.random()*(6)));
            this.accessibleAge = accessibleAge;
            System.out.println(accessibleAge);
            return accessibleAge;

        }else {
            System.out.println("No, please. Why?");

        }
*/


}
