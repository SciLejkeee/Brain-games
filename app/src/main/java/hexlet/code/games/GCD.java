package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static final String QUESTION = "Find the greatest common divisor of given numbers.";

    public static void gcd() {
        Engine.gameEngine(gameLogic(), QUESTION);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int num1 = Engine.getRandom(Engine.RANDOM_MULTIPLICATION);
            int num2 = Engine.getRandom(Engine.RANDOM_MULTIPLICATION);
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
