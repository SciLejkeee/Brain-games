package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Even {
    public static final String QUESTION_EVEN = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void parity() {
        Engine.gameEngine(gameLogic(), QUESTION_EVEN);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int randomNumber = RandomUtils.generateNumber();
            data[i][0] = Integer.toString(randomNumber);
            data[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        return data;

    }
}
