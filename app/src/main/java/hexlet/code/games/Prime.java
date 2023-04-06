package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

import java.math.BigInteger;

public class Prime {

    private static final String QUESTION_PRIME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {
        Engine.gameEngine(gameLogic(), QUESTION_PRIME);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for(int i = 0; i < Engine.ROUND_COUNT; i++) {
            int randomNumber = RandomUtils.generateNumber();
            data[i][0] = String.valueOf(randomNumber);
            data[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        return data;

    }

    private static boolean isPrime(int correctAnswer) {
        BigInteger bigInteger = BigInteger.valueOf(correctAnswer);
        return bigInteger.isProbablePrime((int) Math.log(correctAnswer));
    }
}

