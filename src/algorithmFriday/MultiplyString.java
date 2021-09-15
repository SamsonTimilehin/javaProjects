package algorithmFriday;

public class MultiplyString {

    public static void main(String[] args) {

        System.out.println(displayProductOfStrings("100", "50"));

    }

    public static String displayProductOfStrings(String num1, String num2){

        int storeNum1 = Integer.parseInt(num1);
        int storeNum2 = Integer.parseInt(num2);
        int totalIntValue = storeNum1 * storeNum2;

        return totalIntValue + "";
    }
}
