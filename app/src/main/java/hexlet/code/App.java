package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;


public class App {
    private static int game;
    private static final int EXIT = 0;

    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int GREATEST_COMMON_DIVISOR = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;




    public static void main(String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calculator
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner app = new Scanner(System.in);
        game = app.nextInt();
        switch (game) {
            case GREET -> {
                System.out.println("Your choice:" + game + "\n");
                Cli.run();
            }
            case EVEN -> {
                System.out.println("Your choice:" + game + "\n");
                Even.parity();
            }
            case CALCULATOR -> {
                System.out.println("Your choice:" + game + "\n");
                Calculator.calc();
            }
            case GREATEST_COMMON_DIVISOR -> {
                System.out.println("Your choice:" + game + "\n");
                GCD.gcd();
            }
            case PROGRESSION -> {
                System.out.println("Your choice:" + game + "\n");
                Progression.progression();
            }
            case PRIME -> {
                System.out.println("Your choice:" + game + "\n");
                Prime.prime();
            }
            case EXIT -> {
                System.out.println("Your choice:" + game + "\n");
                System.exit(0);
            }
            default -> {
                System.out.println("Wrong input");
                System.exit(0);
            }
        }
        app.close();
    }
}
