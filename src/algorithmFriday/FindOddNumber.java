package algorithmFriday;

public class FindOddNumber {

    public static void main(String[] args) {

        displayOddNumber(20,2);
    }

    public static void displayOddNumber(int firstNum, int secondNum){

        if(firstNum < secondNum) {

            for (int i = firstNum; i < secondNum; i++) {

                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }else if(firstNum > secondNum){

            for(int i = secondNum; i < firstNum; i++){

                if(i % 2 != 0){
                    System.out.println(i);
                }
            }
        }
    }
}
