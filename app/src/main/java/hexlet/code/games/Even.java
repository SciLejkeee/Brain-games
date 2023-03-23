package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void parity() {
        Engine.gameEngine(gameLogic(), QUESTION);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for(int i = 0; i < Engine.ROUND_COUNT; i++) {
            int randomNumber = Engine.getRandom(Engine.RANDOM_MULTIPLICATION);
            data[i][0] = Integer.toString(randomNumber);
            data[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        return data;

    }
}
