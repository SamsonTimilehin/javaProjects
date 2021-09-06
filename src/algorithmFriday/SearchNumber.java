package algorithmFriday;

import java.util.Arrays;
import java.util.List;

public class SearchNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(6,1,2,8,9,2);
        System.out.println(findFirstNumber(numbers, 4));
    }
    public static int findFirstNumber(List<Integer> number, int numberToSearch){

        int num = number.stream().filter(value -> value > numberToSearch).findFirst().orElse(0);
        return num;
    }
}
