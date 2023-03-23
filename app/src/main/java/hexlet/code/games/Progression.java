package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String QUESTION = "What number is missing in the progression?";
    private static final int ARR_LENGTH = 10;
    public static void progression() {
        Engine.gameEngine(gameLogic(), QUESTION);
    }


    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            String[] progression = new String[ARR_LENGTH];
            int progressionStep = Engine.getRandom(Engine.RANDOM_MULTIPLICATION);
            int randomIndex = Engine.getRandom(progression.length - 1);
            progressionLogic(progression,progressionStep);
            data[i][1] = progression[randomIndex];
            progression[randomIndex] = "..";
            data[i][0] = String.join(" ", progression);
        }
        return data;
    }

    private static void progressionLogic(String[] progression, int progressionStep) {
        progression[0] = Integer.toString(Engine.getRandom(Engine.RANDOM_MULTIPLICATION));
        for(int j = 1; j < progression.length; j++) {
            progression[j] = Integer.toString(Integer.parseInt(progression[j - 1]) + progressionStep);
        }
    }
}
