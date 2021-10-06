package algorithmFriday;

import java.util.Arrays;
import java.util.List;

public class WordSubsets {

    public static void main(String[] args) {

    }
//    public static List<String> displayWordsWithSubset(String[]A, String B){
//
//    }
    public static int[] getCharFrequency(String s){
        int[] result = new int[26];
        for(char c : s.toCharArray()){
            result[c-'a']++;

        }
        return result;
    }
}
