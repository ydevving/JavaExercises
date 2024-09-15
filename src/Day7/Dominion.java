package Day7;

import java.util.Scanner;

public class Dominion {
    public void body() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many provinces you have?");
        int provinces = scanner.nextInt();

        System.out.println("How many duchies you have?");
        int duchies = scanner.nextInt();

        System.out.println("How many estates you have?");
        int estates = scanner.nextInt();

        int total_score = provinces * 6 +  duchies * 3 + estates;
        System.out.println("Your total score: " + total_score);
    }
}
