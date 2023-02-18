package hexlet.code;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter." + "\n" + "1 - Greet" + "\n" + "2 - Even" + "\n" + "0 - Exit");
        Scanner app = new Scanner(System.in);
        var option = app.nextInt();
        if(option == 0) {
            System.exit(0);
        } else {
            System.out.println("Your choice:" + option + "\n");
        }
        Cli.run();
        Even.parity();
        app.close();
    }
}
