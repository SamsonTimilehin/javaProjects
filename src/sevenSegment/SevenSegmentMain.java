package sevenSegment;

public class SevenSegmentMain {

    public static void main(String[] args) {

        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();

   try {
       sevenSegmentDisplay.setLoop("234");
       sevenSegmentDisplay.display();
   }catch (IllegalArgumentException e){
       System.out.println("oh this is not accept");
   }

//   String number = "10011";
//
//   String result = sevenSegmentDisplay.fillUpNumber(number);
//        System.out.println(result);

    }
}

