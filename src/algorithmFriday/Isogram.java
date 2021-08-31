package algorithmFriday;

public class Isogram {

    public static void main(String[] args) {

        String isogram = "thencE";

        boolean result = isIsogram(isogram);
        System.out.println(result);

    }

    public static boolean isIsogram(String stringValue) {




        for (int i = 0; i < stringValue.length(); i++) {

            for (int j = i + 1; j < stringValue.length(); j++) {

                if (stringValue.charAt(i) == stringValue.charAt(j)) {

                    return false;
                }


            }
        }



        return true;
    }
}

