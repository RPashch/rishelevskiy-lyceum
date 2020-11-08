package Homework2_array_for;

public class array_for_3 {
    public static void main(String[] args) {

        int kol = 1;
        int b = 1;

        for (int i=8; i>kol;i--)
        {
            while(b!=i)
            {
                System.out.print("*"); //Вывод нужного количества в строке
                b+=1;
            }
            System.out.println(); //Перенос курсора
            b=1;
        }
    }
}
