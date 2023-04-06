package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;


public class App {
    public static int GAME;
    public static final int EXIT = 0;

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALCULATOR = 3;
    public static final int GREATEST_COMMON_DIVISOR = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;




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
        GAME = app.nextInt();
        switch (GAME) {
            case GREET -> {
                System.out.println("Your choice:" + GAME + "\n");
                Cli.run();
            }
            case EVEN -> {
                System.out.println("Your choice:" + GAME + "\n");
                Even.parity();
            }
            case CALCULATOR -> {
                System.out.println("Your choice:" + GAME + "\n");
                Calculator.calc();
            }
            case GREATEST_COMMON_DIVISOR -> {
                System.out.println("Your choice:" + GAME + "\n");
                GCD.gcd();
            }
            case PROGRESSION -> {
                System.out.println("Your choice:" + GAME + "\n");
                Progression.progression();
            }
            case PRIME -> {
                System.out.println("Your choice:" + GAME + "\n");
                Prime.prime();
            }
            case EXIT -> {
                System.out.println("Your choice:" + GAME + "\n");
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
