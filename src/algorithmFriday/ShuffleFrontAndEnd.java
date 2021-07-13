package algorithmFriday;

import java.util.Arrays;

public class ShuffleFrontAndEnd {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(shuffleByNumber(new int[]{8,5,3}, -5)));
    }
        public static int[] shuffleByNumber(int[] arrayElements, int number){
            int counter = 0;
            int counter2 = 0;
            int store;
            int store2;

            for (int i = 0; i < arrayElements.length; i++) {
                number %= arrayElements.length;
                counter++;
                if (counter <= number && counter > 0) {
                    for (int j = 0, y = arrayElements.length - 1; j < arrayElements.length; j++) {
                        store = arrayElements[j];
                        arrayElements[j] = arrayElements[y];
                        arrayElements[y] = store;
                    }
                }
            }
            for (int k = 0; k < arrayElements.length; k++) {
                number %= arrayElements.length;
                counter2--;
                if (counter2 >= number) {
                    for (int j = 0, y = j + 1; j < arrayElements.length - 1; j++, y++) {
                        store2 = arrayElements[j];
                        arrayElements[j] = arrayElements[y];
                        arrayElements[y] = store2;
                    }
                }

            }
            return arrayElements;
        }
}
