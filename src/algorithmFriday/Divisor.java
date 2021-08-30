package algorithmFriday;

public class Divisor {

    public static void main(String[] args) {
       countDivisors(5000000);
    }
    public static void countDivisors(int numberOfDivisors){

        int counter = 0;

        for(int i = 1; i <= numberOfDivisors; i++){
             if(numberOfDivisors % i == 0){
                 counter++;
             }
        }
        System.out.println(counter);
    }

}
