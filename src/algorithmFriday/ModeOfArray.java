package algorithmFriday;

public class ModeOfArray {

    public static void main(String[] args) {

        System.out.println(findModeOfAnArray(new int[]{2,5,5,3,1,7,6,2,2}));
    }

    public static int findModeOfAnArray(int [] arrayElements){

        int frequency = 0;
        int mode = 0;

        for(int i = 0; i<arrayElements.length; i++ ){
            int counter = 0;
            for(int j = i + 1; j < arrayElements.length; j++){

                if(arrayElements[i] == arrayElements[j]){
                    counter++;
                }
            }
            if(counter > frequency){
                frequency = counter;
                mode = arrayElements[i];
            }
        }
        return mode;
    }
}
