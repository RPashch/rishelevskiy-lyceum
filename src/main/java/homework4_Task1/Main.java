package homework4_Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println("""
                Вводите направление (up, down, right, left) и количество единиц,
                чтобы передвигать точку
                (изначально Point(0, 0)).
                Для окончания работы программы введите [stop].""");
        Scanner scanner = new Scanner(System.in);

//        String res = scanner.nextLine();

        int i = 0;
        while (i == 0){
            String[] directionAndUnits = scanner.nextLine().split(" ");

            switch (directionAndUnits[0]){
                case "up" -> point.up(Float.parseFloat(directionAndUnits[1]));
                case "down" -> point.down(Float.parseFloat(directionAndUnits[1]));
                case "right" -> point.right(Float.parseFloat(directionAndUnits[1]));
                case "left" -> point.left(Float.parseFloat(directionAndUnits[1]));
                case "stop" -> i = 1;
                default -> System.out.println("Введена неверная команда.");
            }
        }

        point.printCoordinates();
    }
}
