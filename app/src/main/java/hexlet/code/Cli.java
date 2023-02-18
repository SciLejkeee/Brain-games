package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String NAME;
        public static void run () {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        NAME = getName();
        System.out.println("Hello, " + NAME + "!");
    }
        public static String getName () {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        return name;
    }
}

