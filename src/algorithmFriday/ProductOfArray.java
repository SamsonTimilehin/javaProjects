package algorithmFriday;

import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(getProductOfArrayElements(new int[]{4,5,10,2})));

    }
    public static int[] getProductOfArrayElements(int[] arrayElements){
        int [] newArray = new int[arrayElements.length];

        for(int firstElement = 0; firstElement < newArray.length; firstElement++) {
            int product = 1;
            for (int secondElement = 0; secondElement < arrayElements.length; secondElement++) {
                if(secondElement == firstElement){
                    continue;
                }
                product *= arrayElements[secondElement];
            }
            newArray[firstElement] = product;
        }
        return newArray;
    }
}


