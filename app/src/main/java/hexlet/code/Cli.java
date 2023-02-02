package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I have your name?");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
