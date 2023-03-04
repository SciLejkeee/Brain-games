package hexlet.code.games;

import hexlet.code.Cli;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    public static void prime() {
        Scanner even = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int i;
        for (i = 0; i < 3; i++) {
            int number = (int) (Math.random() * 100);
            System.out.println("Question: " + number);
            String answer = even.nextLine();
            BigInteger bigInteger = BigInteger.valueOf(number);
            boolean isPrime = bigInteger.isProbablePrime((int) Math.log(number));
            String correctAnswer = isPrime ? "yes" : "no";
            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(." + "Correct answer was " + "'"
                        + correctAnswer + "'." +
                        "\n" + "Let's try again, " + Cli.NAME + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.NAME + "!");
        System.exit(0);

    }
}

