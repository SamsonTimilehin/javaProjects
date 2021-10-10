package emailExtractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private String writeUp;


    public void setWriteUp(String writeUp) {
        this.writeUp = writeUp;
    }

    public void extractEmails() {
        Pattern pattern =
                Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
        Matcher matcher =
                pattern.matcher(writeUp);

        String result;

        while (matcher.find()) {
            result = matcher.group();
            System.out.println(result);
        }
    }
}