package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class GCD {
    public static void gcd() {
        Scanner gcd = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        var i = 0;
        do {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            System.out.println("Question: " + a + " " + b);
            int answer = gcd.nextInt();
            int count = Math.min(a, b);
            for(int n = count; n >= 1; n--) {
                if(a % n == 0 && b % n == 0) {
                    count = n;
                    break;
                }
            }
            if (answer == count) {
                System.out.println("Your answer: " + answer + "\n" + "Correct!");
                i++;
            }
            else {
                System.out.println("Your answer: " + answer + "\n" + "'" + answer + "'" +
                        "is wrong answer ;(. Correct answer was " + "'" + count + "'" + "."
                        + "\n" + "Let's try again, " + Cli.NAME + "!");
                break;
            }
        } while (i < 3);
        if (i == 3) {
            System.out.println("Congratulations, " + Cli.NAME + "!");
            System.exit(0);
        }
    }
}