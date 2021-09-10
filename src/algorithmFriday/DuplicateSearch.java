package algorithmFriday;

public class DuplicateSearch {

    public static void main(String[] args) {

        findDuplicate(new int[]{8,5,2,1,7,8});

    }
    public static void findDuplicate(int[] elementsVal) {
        boolean isDuplicate = false;
        for (int i = 0; i < elementsVal.length; i++) {

            for (int j = i + 1; j < elementsVal.length; j++) {
                if (elementsVal[i] == elementsVal[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate) {
                System.out.println("Array contains duplicate value");
                break;
            }
        }
        if (!isDuplicate) {
            System.out.println("Array does not contain duplicate value");
        }
    }
}
