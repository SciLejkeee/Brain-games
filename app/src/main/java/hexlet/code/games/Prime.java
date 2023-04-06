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
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int randomNumber = RandomUtils.generateNumber(1);
            data[i][0] = String.valueOf(randomNumber);
            data[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        return data;

    }

    private static boolean isPrime(int correctAnswer) {
        boolean isPrime = true;
        if (correctAnswer <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= correctAnswer / 2; i++) {
                if (correctAnswer % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}

