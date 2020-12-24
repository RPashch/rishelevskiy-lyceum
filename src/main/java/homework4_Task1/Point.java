package homework4_Task1;

public class Point {
    private float x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0f;
        this.y = 0f;
    }


    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void up(float units){
        this.y += units;
        System.out.println("Точка преместилась на " + units + " ед. вверх по оси y");
    }

    public void down(float units){
        this.y -= units;
        System.out.println("Точка преместилась на " + units + " ед. вниз по оси у");
    }

    public void right(float units){
        this.x += units;
        System.out.println("Точка преместилась на " + units + " ед. в право по оси х");
    }

    public void left(float units){
        this.x -= units;
        System.out.println("Точка преместилась на " + units + " ед. в лево по оси х");
    }

    public void printCoordinates(){
        System.out.println("Point(x) = " + this.getX() + "\nPoint(y) = " + this.getY());
    }
}
