package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import static hexlet.code.App.GAME;

public class Engine {
    public static void eng() {
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
        }
    }
}
