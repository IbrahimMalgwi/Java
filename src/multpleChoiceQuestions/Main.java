package multpleChoiceQuestions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question1 = "What colour are apples?\n" + "(a) Red/Green\n(b) Purple\n(c) Orange\n\n";
        String question2 = "What colour are Bananas?\n " + "(a) Teal\n(b) Magenta\n(c) Yellow\n\n";
        String question3 = "What colour are strawberries?\n" + "(a) Yellow\n(b) Red\n(c) Blue\n\n";

        Question[] questions = {
                new Question(question1, "a"),
                new Question(question2, "c"),
                new Question(question3, "b")
        };
        takeTest(questions);
    }

    public static void takeTest(Question[] questions){
        int score = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = input.nextLine();
            if (answer.equals(questions[i].answer));
            score++;
        }
        System.out.println("You got "+ score + " out of " + questions.length);
    }

}
