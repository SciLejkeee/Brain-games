package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Progression {

    private static final String QUESTION_PROGRESSION = "What number is missing in the progression?";
    private static final int MAX_PROGRESSION_LENGTH = 10;
    private static final int MIN_PROGRESSION_LENGTH = 5;
    private static final int MAX_LENGTH_PROGRESSION = 4;

    public static void progression() {
        Engine.gameEngine(gameLogic(), QUESTION_PROGRESSION);
    }


    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int numMinOfProgression = RandomUtils.generateNumber();
            int progressionLength = RandomUtils.generateNumber(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int step = RandomUtils.generateNumber(1, MAX_LENGTH_PROGRESSION);
            int randomIndex = RandomUtils.generateNumber(0, progressionLength - 1);
            String[] progressionLine = progressionLogic(numMinOfProgression, step, progressionLength);
            data[i][1] = progressionLine[randomIndex];
            progressionLine[randomIndex] = "..";
            data[i][0] = String.join(" ", progressionLine);
        }
        return data;
    }

    private static String[] progressionLogic(int first, int step, int progressionLength) {
        String[] progression = new String[progressionLength];

        for (int i = 0; i < progressionLength; i += 1) {
            progression[i] = Integer.toString(first + i * step);
        }

        return progression;
    }
}
