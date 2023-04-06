package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.RandomUtils;

public class Calculator {

    private static final String QUESTION_CALCULATOR = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};

    public static void calc() {
        Engine.gameEngine(gameLogic(), QUESTION_CALCULATOR);
    }

    private static String[][] gameLogic() {
        String[][] data = new String[Engine.ROUND_COUNT][Engine.ANSWER_VARIANTS];
        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int num1 = RandomUtils.generateNumber();
            int num2 = RandomUtils.generateNumber();
            String operator = calcExpression();
            data[i][0] = num1 + " " + operator + " " + num2;
            data[i][1] = Calculator.calculate(num1, num2, operator);
        }
        return data;
    }

    private static String calcExpression() {
        return OPERATORS[RandomUtils.generateNumber(0, 2)];
    }

    private static String calculate(int num1, int num2, String operator) {
        var result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else {
            result = num1 * num2;
        }
        return String.valueOf(result);
    }
}
