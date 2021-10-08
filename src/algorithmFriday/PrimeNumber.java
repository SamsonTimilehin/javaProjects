package algorithmFriday;

public class PrimeNumber {

    public static void main(String[] args) {

        findPrime(41);
    }

    public static void findPrime(int number){

        int value = 2;
        boolean notAPrime = false;
        while(value*value <= number){
            if(number%value == 0){
                notAPrime = true;
                break;

            }else {
                value+=1;
            }
        }
        if(notAPrime){
            System.out.println("Not a prime");
        }else {
            System.out.println("It's a prime");
        }
    }
}
