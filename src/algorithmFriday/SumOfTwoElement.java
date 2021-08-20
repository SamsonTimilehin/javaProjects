package algorithmFriday;

import java.util.Arrays;

public class SumOfTwoElement {

    public static void main(String[] args) {

        int[] arrayTest = {4, 1, 6, 2, 3};

        System.out.println(Arrays.toString(displayIndices(arrayTest, 7)));
    }
        public static int[] displayIndices(int[] arrayItems, int sumOfArray) {

            for (int i = 0; i < arrayItems.length; i++)
                for (int j = i + 1; j < arrayItems.length; j++) {
                    if (arrayItems[i] + arrayItems[j] == sumOfArray) {
                        return new int[]{i, j};
                    }

                }
            return new int[]{};
    }
}
