package Homework1;

import java.util.Scanner;

public class n_3 {
    public static void main(String[] args){

        System.out.println("Введите пол:");

        Scanner n = new Scanner(System.in);

        String s = n.nextLine();

        if(s.equals("b")){System.out.println("ну здорова, приятель");}

        else

        if(s.equals("g")){System.out.println("привет,как дела?");}

        else

        if(s.equals("n")){System.out.println("добрый день");}

        else{System.out.println("Вы точно человек?");}

    }

}
