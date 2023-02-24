package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Even {
    public static void parity() {
        Scanner even = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var i = 0;
        do {
            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            String answer = even.nextLine();
                if (number % 2 == 0 && answer.equals("yes")) {
                    System.out.println("Correct!");
                    i++;
                }
                else if (number % 2 == 0 && answer.equals("no")) {
                    System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'." +
                            "\n" + "Let's try again, " + Cli.NAME + "!");
                    System.exit(0);
                }
                else if (number % 2 != 0 && answer.equals("no")) {
                    System.out.println("Correct!");
                    i++;
                }
                else if (number % 2 != 0 && answer.equals("yes")) {
                    System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'." +
                            "\n" + "Let's try again, " + Cli.NAME + "!");
                    break;
                }
                else {
                    System.out.println(answer + " is wrong answer ;(.");
                    break;
                }
            } while (i < 3);
                if (i == 3) {
                    System.out.println("Congratulations, " + Cli.NAME + "!");
                    System.exit(0);
        }
    }
}