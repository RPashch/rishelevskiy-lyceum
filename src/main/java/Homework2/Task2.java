package Homework2;

public class Task2 {
    public static void main(String[] args) {

        int quantity = 10;
        int[] array = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            array[i] = (int) (Math.random() * (100 - (1) + 1)) + (1);
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        for (int c = 0; c < quantity; c++) {
            for (int k = quantity - 1; k > c; k--) {
                if (array[k-1] > array[k]){
                    int ps= array[k-1];
                    array[k-1]=array[k];
                    array[k]=ps;
                }
            }
            System.out.print(array[c] + " ");
        }
    }
}
