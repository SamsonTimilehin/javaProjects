package quizApp;

import java.util.*;

public class Quiz {
    private final List<Question> questionSet = new ArrayList<>();

    public Quiz() {

        String q = "What is your name?";
        String[] c = {"Goat","Monkey","John","Dog"};
        String ans = "John";
        questionSet.add(new Question(q,c,ans));

        q = "Where do you stay?";
        c = new String[] {"Water","Bird",
                "Lagos","Dog"};
        ans = "Lagos";
        questionSet.add(new Question(q,c,ans));

        q = "What is the name of your School?";
        c = new String[]{"New York","Royal College",
                "Lagos","Oyo"};
        ans = "Royal College";
        questionSet.add(new Question(q,c,ans));

        Collections.shuffle(questionSet, new Random());
    }
    public void displayQuiz(){
        Scanner scanner = new Scanner(System.in);
        int numCorrect = 0;
        for(int i = 0; i < questionSet.size(); i++){
            System.out.println(questionSet.get(i).getQuestion());
            int numChoices = questionSet.get(i).getChoices().size();

            for(int choice = 0; choice < numChoices; choice++){
                System.out.println((choice + 1)+": " +
                        questionSet.get(i).getChoices().get(choice));
            }
            int playerAnswer = scanner.nextInt();
            List<String> choiceSet =
                    questionSet.get(i).getChoices();

            String correctAnswer = questionSet.get(i).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);

            if(playerAnswer == correctAnswerIndex + 1){
                numCorrect++;
            }
        }
        scanner.close();
        System.out.println("You got " + numCorrect + "/3");
    }
}
