package lesson5;

public class UserGenerator {
    String Names [] = {"Nikita", "Dmitriy", "Yaroslav", "Rustam", "Eugesha", "Nikola", "Matvey", "Vadim", "Kevin", "Vladislav"};
    String  LastName [] = {"Davydov", "Gorohov", "Yakimov", "Gadjiev", "Petrenko", "Bezsalov", "Minakov", "Danesi", "Ashmiakov", "Berezgnoy"};

    public int accessibleAge;
    public String lastName;
    public String names;

    public int AccessibleAge() {
        int accessibleAge = (int)(14+(Math.random())*6);
        return accessibleAge;
    }
    public String Names(){
        int f = (int)((Math.random())*10);
        String name = Names[f];
        return name;
    }
    public String LastName(){
        int i = (int)((Math.random())*10);
        String lastName = LastName[i];
        return lastName;
    }

    public UserGenerator(String name, String lastNames, int accessibleAge){
        this.names = name;
        this.lastName = lastNames;
        this.accessibleAge = accessibleAge;
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
