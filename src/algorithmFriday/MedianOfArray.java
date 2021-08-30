package algorithmFriday;

import java.util.Arrays;

public class MedianOfArray {

    public static void main(String[] args) {

        findMedian(new int[]{6,3,1,7},new int[]{90,4,5,78});

    }
    public static void findMedian(int [] array1, int [] array2){

        int[] addedArray = combineTwoArrays(array1, array2);
        System.out.println("Sorted Array is : "+Arrays.toString(addedArray));

        if(addedArray.length % 2 != 0){
            int singleMedian = addedArray[addedArray.length/2];
            System.out.println("Median is value : " + singleMedian);
        }
        if(addedArray.length % 2 == 0){
            int twoMedianElements = addedArray[addedArray.length/2] + addedArray[(addedArray.length/2)-1];
            double result = twoMedianElements/2.0;
            System.out.println("Median value is : " + result);
        }
    }

    public static int[] combineTwoArrays(int[] number1, int [] number2) {
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
        int storeVariable;
        for(int i = 0; i < sortItem.length; i++){

            for(int j = i + 1; j < sortItem.length; j++){
                if(sortItem[i] > sortItem[j]){
                    storeVariable = sortItem[i];
                    sortItem[i] = sortItem[j];
                    sortItem[j] = storeVariable;
                }
            }
        }
    }
}
