package sevenSegment;

public class SevenSegmentDisplay {
    private  int[][] loop = new int[5][4];


    public void display() {
        for (int[] ints : loop) {
            for (int column : ints) {
                if (column == 1) System.out.print("# ");
                if (column == 0) {
                    System.out.print("  ");
                }

            }
            System.out.println();
//            System.out.println();
        }
    }

    public void writeOnA(){

        for(int i = 0; i< 4; i++){
            loop[0][i]=1;
        }

    }
    public void writeOnB(){

        for(int i = 0; i<3; i++){
            loop[i][3]=1;
        }
    }
    public void writeOnC(){

        for(int i = 2; i<5; i++){
            loop[i][3]=1;
        }
    }
    public void writeOnD(){

        for(int i = 0; i<4; i++){
            loop[4][i]=1;
        }
    }
    public void writeOnE() {

        for(int i = 2; i<5; i++){
            loop[i][0]=1;
        }
    }
    public void writeOnF(){

        for(int i = 0; i<3; i++){
            loop[i][0]=1;
        }
    }
    public void writeOnG(){
        for(int i = 0; i<4; i++){
            loop[2][i]=1;
        }
    }
    public void setLoop(String number){
        number  = convertInputToBinary(number);
        for(int i = 0; i < number.length(); i++){

            if(number.length() > 8){
                throw new IllegalArgumentException( "oh no Samson!");
            }else if(number.charAt(i) > '1'){
                throw new IllegalArgumentException("Wrong input Sam!");
            }else if(number.charAt(7) == '0') {
                break;
            }
             if(number.charAt(i) == '1'){
                switch (i){
                    case 0: writeOnA();
                    break;
                    case 1: writeOnB();
                    break;
                    case 2: writeOnC();
                    break;
                    case 3: writeOnD();
                    break;
                    case 4: writeOnE();
                    break;
                    case 5: writeOnF();
                    break;
                    case 6: writeOnG();
                    break;

                }
            }
        }
    }

//    public void validationMethod(String number){
//        for(int i = 0; i < number.length(); i++){
//
//            if(number.length() > 8){
//                throw new IllegalArgumentException( "oh no Samson!");
//            }else if(number.charAt(i) > '1') {
//                throw new IllegalArgumentException("Wrong input Sam!");
//            }
//
//
//        }
//    }
    public String fillUpNumber(String number){
        //validationMethod(number);
        if(number.length() < 8){
            StringBuilder stringBuilder = new StringBuilder();
            int length = 8 - number.length();
            while(length > 0){
                stringBuilder.append("0");

                length--;
            }
            stringBuilder.append(number);
            number = stringBuilder.toString();
        }

        return number;
    }

    public String convertInputToBinary(String number){

        int storeInteger = Integer.parseInt(number);

        String binaryNumber= "";
        while(storeInteger  > 0) {

            int remainder = storeInteger % 2;
            storeInteger = storeInteger / 2;

            binaryNumber = remainder + binaryNumber;

        }
       return binaryNumber;
    }
}
