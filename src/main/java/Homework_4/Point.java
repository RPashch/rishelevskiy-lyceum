package Homework_4;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void up(int a) {
        System.out.println("Точка перемещается на "+a+" единиц вверх");
        y+=a;

    }

    void down(int a) {
        System.out.println("Точка перемещается на "+a+" единиц вниз");
        y-=a;
    }

    void left(int a) {
        System.out.println("Точка перемещается на "+a+" единиц влево");
        x-=a;
    }

    void right(int a) {
        System.out.println("Точка перемещается на "+a+" единиц вправо");
        x+=a;
    }

    public void printCoordinates() {
        System.out.print("X = "+x+"\nY = "+y);
    }
}
