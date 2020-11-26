package homeworks;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

                Scanner inx = new Scanner(System.in);
                System.out.print("введите x: ");
                int x = inx.nextInt();

                if (x == 0) {
                    System.out.print("Значение X = 0");
                } else if (x < 0 ) {
                    System.out.print("Значение X < 0");
                } else if (x > 0) {
                    System.out.print("Значение X > 0");
                } else {
                    System.out.print("Это оператор else");
                }
            }

        }

