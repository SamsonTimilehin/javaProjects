package solidOpenClosePrinciple;

public class OpenCloseTest {

    public static void main(String[] args) {
       ArrayUtil arrayUtil = new ArrayUtil();
        int[]arr = {1,5,4,2,3};

        arrayUtil.sort(arr, new DescComparator());
        System.out.println("Values in the array are:");
        for(int eleVal: arr){
            System.out.println(eleVal);
        }
    }
}
