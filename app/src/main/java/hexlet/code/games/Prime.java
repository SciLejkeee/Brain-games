package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class Prime {

    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void prime() {
        Engine.gameEngine(gameLogic(), QUESTION);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for(int i = 0; i < Engine.ROUND_COUNT; i++) {
            int randomNumber = Engine.getRandom(Engine.RANDOM_MULTIPLICATION);
            String correctAnswer = isPrime(randomNumber);
            data[i][0] = Integer.toString(randomNumber);
            data[i][1] = correctAnswer;
        }
        return data;

    }

    private static String isPrime(int number) {
        BigInteger bigInteger = BigInteger.valueOf(number);
        boolean isPrime = bigInteger.isProbablePrime((int) Math.log(number));
        return isPrime ? "yes" : "no";
    }
}

