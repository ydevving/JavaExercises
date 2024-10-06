package Day19;

import java.util.Scanner;

public class SimulasTest {

    enum CHEST_STATE {
        OPEN,
        CLOSED,
        LOCKED
    }

    public static void body() {
        Scanner sc = new Scanner(System.in);

        CHEST_STATE chest = CHEST_STATE.LOCKED;
        String c = "locked";

        while (true) {
            System.out.println("The chest is " + chest + ". What do you want to do?");

            String choice = sc.next().toLowerCase();

            if (chest == CHEST_STATE.OPEN) {
                if (choice.equals("close")) {
                    chest = CHEST_STATE.CLOSED;
                }
            } else if (chest == CHEST_STATE.CLOSED) {
                if (choice.equals("open")) {
                    chest = CHEST_STATE.OPEN;
                } else if (choice.equals("lock")) {
                    chest = CHEST_STATE.LOCKED;
                }
            } else if (chest == CHEST_STATE.LOCKED) {
                if (choice.equals("unlock")) {
                    chest = CHEST_STATE.CLOSED;
                }
            }
        }
    }
}
