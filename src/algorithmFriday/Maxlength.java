package algorithmFriday;

import java.util.ArrayList;
import java.util.List;

public class Maxlength {

    public static void main(String[] args) {

        List<String> stringList = List.of("good", "it", "foe","yours");
        System.out.println(findMaximumLength(stringList));

    }
    public static int findMaximumLength(List<String> arr){
        
        int intValue = 0;
        
        List<String> temp = new ArrayList<>();
        
        for(int  i = 0; i < arr.size(); i++){
            
            for(int j = i + 1; j < arr.size(); j++ ){
                
               temp.add(arr.get(i) + arr.get(j));
            }
        }
        System.out.println(temp);
        for(int k = 0; k < temp.size(); k++){
            
            for(int m = k + 1; m < temp.size(); m++){
                
                if(temp.get(k).length() < temp.get(m).length()){
                    intValue = temp.get(m).length();
                    System.out.println(intValue);
                }else if(temp.get(m).length() < temp.get(k).length()){
                    intValue = temp.get(k).length();
                    System.out.println(intValue);
                }
            }
        }
       return intValue;
    }
}
