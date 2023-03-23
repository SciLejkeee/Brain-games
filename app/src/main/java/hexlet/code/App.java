package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;


public class App {
    public static int GAME;
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
                case 1 -> {
                    System.out.println("Your choice:" + GAME + "\n");
                    Cli.run();
                }
                case 2 -> {
                    System.out.println("Your choice:" + GAME + "\n");
                    Even.parity();
                }
                case 3 -> {
                    System.out.println("Your choice:" + GAME + "\n");
                    Calculator.calc();
                }
                case 4 -> {
                    System.out.println("Your choice:" + GAME + "\n");
                    GCD.gcd();
                }
                case 5 -> {
                    System.out.println("Your choice:" + GAME + "\n");
                    Progression.progression();
                }
                case 6 -> {
                    System.out.println("Your choice:" + GAME + "\n");
                    Prime.prime();
                }
                case 0 -> {
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
