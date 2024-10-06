package Day12;

import java.util.Scanner;
import java.util.Random;

public class Prototype {
    public static void body() {

        boolean guessed = false;
        boolean user1_guessed = false;
        boolean user2_guessed = false;
        int user_turn = 0;

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();
        int randomNum = rand.nextInt(100 - 0 + 1) + 0;

        while (!user1_guessed) {
            System.out.println("User 1 enter a number: ");
            int user1_num = sc.nextInt();

            if (user1_num == randomNum) {
                System.out.println("Number guessed!");
                user1_guessed = true;
            } else if (user1_num < randomNum) {
                System.out.println("User 1 guessed lower");
            } else if (user1_num > randomNum) {
                System.out.println("User " + user_turn + " guessed higher");
            }
        }

        System.out.println("User 1 guessed right");

        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
        }

        while (!user2_guessed) {
            System.out.println("User 2 enter a number: ");
            int user2_num = sc.nextInt();

            if (user2_num == randomNum) {
                System.out.println("Number guessed!");
                user2_guessed = true;
            } else if (user2_num < randomNum) {
                System.out.println("User 2 guessed lower");
            } else if (user2_num > randomNum) {
                System.out.println("User 2 guessed higher");
            }
        }

        System.out.println("User 2 guessed also right!");

        return;
    }
}
