package algorithmFriday;

import java.util.Locale;

public class Isogram {

    public static void main(String[] args) {

        isIsogram("   ");

    }

    public static void isIsogram(String stringValue) {


        StringBuilder storeCharacters = new StringBuilder();

        for (int i = 0; i < stringValue.length(); i++) {

            for (int j = i + 1; j < stringValue.length(); j++) {

                if (stringValue.charAt(i) == stringValue.charAt(j)) {
                    storeCharacters.append(stringValue.charAt(j));
                }

            }
        }
        if(storeCharacters.length() > 0){

            System.out.println("It is not an Isogram");
        }
        if(storeCharacters.isEmpty() ){

            System.out.println("It is an Isogram");

        }
    }
}

