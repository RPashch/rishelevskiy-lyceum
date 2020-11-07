import java.util.Scanner;

public class Task3{

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter who u are (b, g or n):");
        String str = s.nextLine();

        if (str.equals("b")){
            System.out.println("Hey bro!");
        }else if (str.equals("g")){
            System.out.println("Hi, how are u?");
        }else if (str.equals("n")){
            System.out.println("Good evening.");
        }else{
            System.out.println("Are u sure, that ur a person???");
        }
    }
}