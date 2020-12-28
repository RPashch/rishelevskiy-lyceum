package Homework_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point point = new Point();

        System.out.println("Введите направление и расстояние сдвига объекта.\n'up,down,left,right' <нужное расстояние>\nДля завершения напишите 'stop'.");

        String shift = scanner.nextLine();

        while(!shift.equals("stop")) {

            String[] shiftCoordinates = shift.split(" ");
            switch (shiftCoordinates[0]) {
                case "up": point.up(Integer.parseInt(shiftCoordinates[1]));break;
                case "down": point.down(Integer.parseInt(shiftCoordinates[1]));break;
                case "left": point.left(Integer.parseInt(shiftCoordinates[1]));break;
                case "right": point.right(Integer.parseInt(shiftCoordinates[1]));break;
            }

            shift = scanner.nextLine();
        }

        point.printCoordinates();
    }
}
