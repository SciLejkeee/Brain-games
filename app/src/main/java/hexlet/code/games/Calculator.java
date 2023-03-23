package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {

    public static final String TASK_CALCULATOR = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static final String[] OPERANDS = {"+", "-", "*", "/"};

    public static void calc() {
        Engine.gameEngine(gameLogic(), TASK_CALCULATOR);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            String getExpression = calcExpression();
            data[i][0] = getExpression;
            data[i][1] = Integer.toString(randomExpression(getExpression));
        }
        return data;
    }

    private static String calcExpression() {
        int num1 = Engine.getRandom(Engine.RANDOM_MULTIPLICATION);
        int num2 = Engine.getRandom(Engine.RANDOM_MULTIPLICATION);
        String operations = OPERANDS[Engine.getRandom(OPERANDS.length)];
        return num1 + " " + operations + " " + num2;
    }

    private static int randomExpression(String getExpression) {
        String[] randomOperand = getExpression.split(" ");
        return switch (randomOperand[1]) {
            case "+" -> Integer.parseInt(randomOperand[0]) + Integer.parseInt(randomOperand[2]);
            case "-" -> Integer.parseInt(randomOperand[0]) - Integer.parseInt(randomOperand[2]);
            case "*" -> Integer.parseInt(randomOperand[0]) * Integer.parseInt(randomOperand[2]);
            default -> throw new RuntimeException("Invalid Operation");
        };
    }
}