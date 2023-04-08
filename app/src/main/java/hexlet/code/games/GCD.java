package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class GCD {
    public static final String QUESTION_GCD = "Find the greatest common divisor of given numbers.";
    private static final int MAX_RANDOM_NUMBERS = 20;
    private static final int MIN_RANDOM_NUMBERS = 1;

    public static void gcd() {
        Engine.gameEngine(gameLogic(), QUESTION_GCD);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int num1 = RandomUtils.generateNumber(MIN_RANDOM_NUMBERS, MAX_RANDOM_NUMBERS);
            int num2 = RandomUtils.generateNumber(MIN_RANDOM_NUMBERS, MAX_RANDOM_NUMBERS);
            data[i][0] = num1 + " " + num2;
            data[i][1] = Integer.toString(greatestNumber(num1, num2));
        }
        return data;
    }

    private static int greatestNumber(int num1, int num2) {
        int count = Math.min(num1, num2);
        for (int n = count; n >= 1; n--) {
            if (num1 % n == 0 && num2 % n == 0) {
                count = n;
                break;
            }
        }
        return count;
    }
}
