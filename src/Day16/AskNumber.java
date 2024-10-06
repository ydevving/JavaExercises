package Day16;

import java.util.Scanner;

public class AskNumber {

    public static final Scanner sc = new Scanner(System.in);

    public static void body() {
        int result = askForNumber("What is your age?");
        System.out.println("Your age is " + result + "!");
    }

    public static int askForNumber(String text) {
        System.out.println(text);
        return sc.nextInt();
    }

    public static int askForNumber(String text, int min, int max) {
        System.out.println(text);
        int num = sc.nextInt();

        if (num > min && num < max) {
            return num;
        }

        return 0;
    }
}
