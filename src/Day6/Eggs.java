package Day6;

import java.util.Scanner;

public class Eggs {
    public void body() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chocolate eggs have you gathered?");
        int eggs_gathered = scanner.nextInt();

        int sister_loot = eggs_gathered / 4;
        int remainder = eggs_gathered % 4;

        System.out.println("Each sister gets " + sister_loot + " eggs and the duckbear gets " + remainder);

        // Answer: the answer is 1, 2 and 3 eggs
    }
}
