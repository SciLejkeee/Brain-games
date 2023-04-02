package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Prime {

    private static final String QUESTION_PRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {
        Engine.gameEngine(gameLogic(), QUESTION_PRIME);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for(int i = 0; i < Engine.ROUND_COUNT; i++) {
            int randomNegativeOrPositiveNumber = RandomUtils.generateNumber(0, 2);
            int randomNumber = RandomUtils.generateNumber();
            int correctAnswer = randomNegativeOrPositiveNumber == 1 ? randomNumber : randomNumber * (-1);
            data[i][0] = String.valueOf(correctAnswer);
            data[i][1] = isPrime(correctAnswer) ? "yes" : "no";
        }
        return data;

    }

    private static boolean isPrime(int correctAnswer) {
        if (correctAnswer == 2) {
            return true;
        }
        if (correctAnswer < 0 || correctAnswer == 1 || correctAnswer % 2 == 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(correctAnswer); i++) {
            if(correctAnswer % i == 0) {
                return false;
            }
        }
        return true;
    }
}

