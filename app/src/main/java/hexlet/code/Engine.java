package hexlet.code;

import static hexlet.code.App.GAME;

public class Engine {
    public static void eng() {
        switch (GAME) {
            case 1:
                System.out.println("Your choice:" + GAME + "\n");
                Cli.run();
                break;
            case 2:
                System.out.println("Your choice:" + GAME + "\n");
                Even.parity();
                break;
            case 3:
                System.out.println("Your choice:" + GAME + "\n");
                Calculator.calc();
                break;
        }
    }
}
