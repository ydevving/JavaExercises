package Day18;

import java.util.Scanner;

public class Manticore {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void body() {
        int manticore_hp = 10;
        int consolas_hp = 15;
        int round = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Player 1, how far away from the city do you want to station the Manticore?");
        int range = sc.nextInt();

        if (range < 1 || range > 100) {
            System.out.println("Error: The range must be between 1 and 100");
            return;
        }

        System.out.println("Player 2, it is your turn.");

        while (true) {
            round++;

            System.out.println("--------------------------------------------------------");
            System.out.println("STATUS: Round: " + round  + " City: " + consolas_hp + "/15" + " Manticore: " + manticore_hp + "/10");

            int cannon_dmg;

            if (round % 3 == 0 && round % 5 == 0) {
                cannon_dmg = 10;
            } else if (round % 3 == 0) {
                cannon_dmg = 3;
            } else if (round % 5 == 0) {
                cannon_dmg = 5;
            } else {
                cannon_dmg = 1;
            }

            System.out.println("Enter desired cannon range: ");
            int cannon_range = sc.nextInt();

            if (cannon_range > range) {
                System.out.println(ANSI_YELLOW + "That round OVERSHOT the target." + ANSI_RESET);
                consolas_hp -= 1;
            } else if (cannon_range < range) {
                System.out.println(ANSI_YELLOW + "That round FELL SHORT of the target." + ANSI_RESET);
                consolas_hp -= 1;
            } else if(cannon_range == range) {
                manticore_hp -= cannon_dmg;
                System.out.println(ANSI_GREEN + "That round was a DIRECT hit." + ANSI_RESET);
            }

            if (manticore_hp == 0) {
                System.out.println(ANSI_BLUE + "You\'ve defeated Manticore, hooray!" + ANSI_RESET);
                return;
            } else if (consolas_hp == 0) {
                System.out.println(ANSI_RED + "You\'ve lost, Consolas was destroyed..." + ANSI_RESET);
                return;
            }
        }
    }
}
