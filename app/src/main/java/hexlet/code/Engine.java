package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ANSWER_VARIANTS = 2;
    public static final int ROUND_COUNT = 3;
    public static final Scanner SCANNER = new Scanner(System.in);


    public static void gameEngine(String[][] questionAnswer, String helloUser) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String playerName = SCANNER.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(helloUser);


        for (String[] questionAndAnswers : questionAnswer) {
            System.out.println("Question: " + questionAndAnswers[0]);

            System.out.print("Your answer: ");
            String inputAnswer = SCANNER.next();


            if (inputAnswer.equals(questionAndAnswers[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + inputAnswer + "' is wrong answer ;(. Correct answer was '" +
                        questionAndAnswers[1] + "'." + "\n" + "Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
