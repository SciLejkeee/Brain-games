package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {

    private static final String QUESTION_CALCULATOR = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int COUNT_OF_OPERATIONS = 3;

    public static void calc() {
        Engine.gameEngine(gameLogic(), QUESTION_CALCULATOR);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int num1 = RandomUtils.generateNumber();
            int num2 = RandomUtils.generateNumber();
            String getExpression = calcExpression();
            data[i][0] = num1 + "" + calcExpression() + "" + num2;
            data[i][1] = Calculator.calculate(num1, num2, getExpression);
        }
        return data;
    }

    private static String calcExpression() {
        int numberOfOperations = RandomUtils.generateNumber(0,COUNT_OF_OPERATIONS);
        String mathematicalOperators = "";
        switch (numberOfOperations) {
            case 0:
                mathematicalOperators = "+";
                break;
            case 1:
                mathematicalOperators = "-";
                break;
            case 2:
                mathematicalOperators = "*";
            default:
                break;
        }
        return mathematicalOperators;
    }

    private static String calculate(int num1, int num2, String getExpression) {
        var result = 0;
        if(getExpression.equals("+")) {
            result = num1 + num2;
        }
        else if(getExpression.equals("-")) {
            result = num1 - num2;
        }
        else {
            result = num1 * num2;
        }
        return String.valueOf(result);
    }
}
