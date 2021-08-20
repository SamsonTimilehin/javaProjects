package algorithmFriday;

import java.util.Arrays;

public class CombineTwoArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(displayArray(new int[]{13,15,19,25}, new int[]{11,13,18})));

    }
    public static int[] displayArray(int[] number1, int [] number2) {
        int[] arrayStore = new int[number1.length + number2.length];
        int counter1 = 0;
        int counter2 = 0;
        for(int i = 0; i < number1.length; i++){
            arrayStore[counter1] = number1[i];
            counter1++;
        }
        counter2 += counter1;
        for(int j = 0; j < number2.length; j++){
            arrayStore[counter2] = number2[j];
            counter2++;
        }
        sortArray(arrayStore);
        return arrayStore;
    }
    public static void sortArray(int[] sortItem){
        int temp;
        for(int i = 0; i < sortItem.length; i++){

            for(int j = i + 1; j < sortItem.length; j++){
                if(sortItem[i] > sortItem[j]){
                    temp = sortItem[i];
                    sortItem[i] = sortItem[j];
                    sortItem[j] = temp;
                }
            }
        }
    }
}
