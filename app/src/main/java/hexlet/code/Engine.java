package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static String NAME;
    public static final int ANSWER_VARIANTS = 2;
    public static final int ROUND_COUNT = 3;
    public static final Random RANDOM = new Random();
    public static final int RANDOM_MULTIPLICATION = 100;

    public static final Scanner SCANNER = new Scanner(System.in);

    public static int getRandom(int randomNum) {
        return RANDOM.nextInt(randomNum);
    }

    public static void gameEngine(String[][] questionAnswer, String helloUser) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String playerName = SCANNER.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(helloUser);


        for (var i = 0; i < ROUND_COUNT; i++) {
            System.out.println("Question: " + questionAnswer[i][0]);

            String correctAnswer = questionAnswer[i][1];
            System.out.print("Your answer: ");
            String inputAnswer = SCANNER.next();


            if (inputAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + inputAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'."
                        + "\n" + "Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
