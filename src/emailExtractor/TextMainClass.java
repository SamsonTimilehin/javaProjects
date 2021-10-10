package emailExtractor;

import java.util.Scanner;

public class TextMainClass {

    public static void main(String[] args) {

        Text textObject = new Text();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Paste your text for email extraction");
        String text = scanner.nextLine();

        textObject.setWriteUp(text);
        textObject.extractEmails();
    }
}
