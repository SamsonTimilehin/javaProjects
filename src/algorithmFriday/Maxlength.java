package algorithmFriday;

import java.util.ArrayList;
import java.util.List;

public class Maxlength {

    public static void main(String[] args) {

        List<String> stringList = List.of("good", "it", "foe","yours");
        System.out.println(findMaximumLength(stringList));

    }
    public static int findMaximumLength(List<String> arr){
        
        int intValue;
        int highestValue = 0;
        
        List<String> temp = new ArrayList<>();
        
        for(int  i = 0; i < arr.size(); i++){
            
            for(int j = i + 1; j < arr.size(); j++ ){
                
               temp.add(arr.get(i) + arr.get(j));
            }
        }
        System.out.println(temp);
        for (String s : temp) {
            intValue = s.length();

            if (intValue > highestValue) {
                highestValue = intValue;
            }
        }
       return highestValue;
    }
}
