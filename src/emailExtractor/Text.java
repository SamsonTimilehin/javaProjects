package emailExtractor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {

    private String writeUp;
    private final List<String> RESULT = new ArrayList<>();


    public void setWriteUp(String writeUp) {
        this.writeUp = writeUp;
    }

    public void extractEmails() {
        Pattern pattern =
                Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+");
        Matcher matcher =
                pattern.matcher(writeUp);

        while (matcher.find()) {
            RESULT.add( matcher.group());

        }
    }
    public List<String> getExtractedEmails(){
        extractEmails();
        return RESULT;
    }
}