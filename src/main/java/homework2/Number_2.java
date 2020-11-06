package homework2;

public class Number_2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        boolean is_sorted = true;
        int count, x;

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        while (is_sorted){
                count = 0;
                System.out.println("\n--------------------");
                for (int i = 0; i < 9; i++){
                    if (array[i] > array[i+1]){
                        x = array[i];
                        array[i] = array[i+1];
                        array[i+1] = x;
                        count++;
                    }
                }

                if (count == 0){
                    is_sorted = false;
                }

                for (int el : array){
                    System.out.print(el + " ");
                }

                System.out.println("\n--------------------");
        }

    }
}
