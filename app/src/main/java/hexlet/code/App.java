package hexlet.code;
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
        if(GAME == 0) {
            System.exit(0);
        }
        else {
            Cli.run();
            Engine.eng();
        }
        app.close();
    }
}
