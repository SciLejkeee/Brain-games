package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Progression {
    public static void progression() {
        Scanner progression = new Scanner(System.in);
        int a;
        System.out.println("What number is missing in the progression?");
        for (a = 0; a < 3; a++) {
            String[] arr = new String[5];
            int firstNum = (int) (Math.random() * 100);
            int step = (int) (Math.random() * 100);
            arr[0] = String.valueOf(firstNum);
            for (int i = 1; i < arr.length; i++) {
                arr[i] = String.valueOf(parseInt(arr[i - 1]) + step);
            }
            int randomIndex = (int) (Math.random() * arr.length);
            int answer = parseInt(arr[randomIndex]);
            arr[randomIndex] = "..";
            StringBuilder question = new StringBuilder();
            for (String s : arr) {
                question.append(" ").append(s).append(" ");
            }
            System.out.println("Question: " + question);
            int answerScanner = progression.nextInt();
            if (answerScanner == answer) {
                System.out.println("Your answer: " + answerScanner + "\n" + "Correct!");
                a++;
            } else {
                System.out.println("Your answer: " + answerScanner + "\n" + "'" + answerScanner + "'" +
                        "is wrong answer ;(. Correct answer was " + "'" + answer + "'" + "."
                        + "\n" + "Let's try again, " + Cli.NAME + "!");
                break;
            }
            if (a == 3) {
                System.out.println("Congratulations, " + Cli.NAME + "!");
                System.exit(0);
            }
        }
    }
}
