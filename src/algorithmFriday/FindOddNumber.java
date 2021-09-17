package algorithmFriday;

public class FindOddNumber {

    public static void main(String[] args) {

        displayOddNumber(2,20);
    }

    public static void displayOddNumber(int firstNum, int secondNum){


        for(int i = firstNum; i < secondNum; i++){

            if( i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
