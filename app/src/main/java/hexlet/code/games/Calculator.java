package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Calculator {
    public static void calc() {
        Scanner sc = new Scanner(System.in);
        String[] operands = {"+", "-", "*", "/"};
        int count = 0;
        for(int i = 0; i < 3; i++) {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            int index = (int) (Math.random() * 4);
            String operand = operands[index];
            System.out.println("What is the result of the expression?" + "\n" + "Question: " + a + operand + b);
            int result;
            switch (operand) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                default -> result = a / b;
            }
            int answer = sc.nextInt();
            if (result == answer) {
                count++;
                System.out.println("Your answer: " + answer + "\n" + "Correct!");
            } else {
                System.out.println("Your answer: " + answer + "\n" + "'" + answer + "'" +
                        "is wrong answer ;(. Correct answer was " + "'" + result + "'" + "."
                        + "\n" + "Let's try again, " + Cli.NAME + "!");
                break;
            }
        }
        if(count == 3) {
            System.out.println("Congratulations! " + Cli.NAME);
            System.exit(0);
        }
        else {
            System.out.println("Try again!" + Cli.NAME);
            System.exit(0);
        }
    }
}

