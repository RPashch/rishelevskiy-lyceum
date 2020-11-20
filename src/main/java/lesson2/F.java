package lesson2;

class F {
    public static void main(String[] args) {

        int x = 30;

        if (x < 20) {
            System.out.println("Это оператор if");
            x = 1;
        } else {
            System.out.println("Это оператор else");
            x = 0;
        }
        System.out.println(x);

    }
}
