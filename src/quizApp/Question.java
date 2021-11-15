package quizApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {


    private final String question;
    private final List<String> choices = new ArrayList<>();
    private final String answer;

    public Question(String question, String[] ArrayOfOptions, String answer) {
        this.question = question;

        for(int i = 0; i < ArrayOfOptions.length; i++){
            choices.add(ArrayOfOptions[i]);
        }
        Collections.shuffle(choices);
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }
}
