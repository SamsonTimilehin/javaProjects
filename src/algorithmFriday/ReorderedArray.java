package algorithmFriday;


import java.util.Arrays;

public class ReorderedArray {

    public static void main(String[] args) {

        String testArray = "the3 read1 goes5 you2 and4";
        System.out.println(displaySortedString(testArray));

    }
    public static String displaySortedString(String stringArray) {

        String[] tokens = stringArray.split("\\+s");

        String[] newArray = new String[tokens.length];

        for(String token : tokens){

            for(int i = 0; i < token.length(); i++){


                if(Character.isDigit(token.charAt(i))){
                    int digit = Integer.parseInt(String.valueOf(token.charAt(i)));
                    newArray[digit-1] = token;
                    //break;
                }

            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stringArray);
        stringArray = sb.toString();

        return stringArray;
    }
}
