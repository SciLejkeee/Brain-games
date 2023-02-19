package hexlet.code;

import java.util.Scanner;

public class Calculator {
    public static void calc() {
        Scanner calculator = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        var i = 0;
        do {
            int num1 = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);
            System.out.println("Question: " + num1 + "+" + num2);
            int calc = calculator.nextInt();
            if(num1 + num2 == calc) {
                System.out.println("Your answer: " + calc + "\n" + "Correct!");
            }
            else {
                System.out.println(calc + "is wrong answer ;(. Correct answer was" + num1 + num2 + ".");
            }
                System.out.println("Question: ");
                System.out.println(num1 + "-" + num2);
                if (num1 - num2 == calc) {
                    System.out.println("Your answer: " + calc + "\n" + "Correct!");
                } else {
                    System.out.println(calc + "is wrong answer ;(. Correct answer was" + (num1 - num2) + ".");
                }
            System.out.println("Question: " + num1 + "*" + num2);
            if(num1 * num2 == calc) {
                System.out.println("Your answer: " + calc + "\n" + "Correct!");
            }
            else {
                System.out.println(calc + "is wrong answer ;(. Correct answer was" + num1 * num2 + ".");
            }
            while (i < 3) ;
            if (i == 3) {
                System.out.println("Congratulations, " + Cli.NAME + "!");
                System.exit(0);
            }
        }while (i < 3);
    }
}
