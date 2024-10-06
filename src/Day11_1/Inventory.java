package Day11_1;

import java.util.Scanner;

public class Inventory {
    public static void body() {
        String[] items = {"Rope", "Torches", "Climbing Equipment", "Clean Water", "Machete", "Canoe", "Food Supplies"};

        String menu = "1. " + items[0] + "\n" + "2. " + items[1] + "\n" + "3. " + items[2] + "\n" + "4. " + items[3] + "\n" +
                "5. " + items[4] + "\n" + "6. " + items[5] + "\n" + "7. " + items[6] + "\n";

        Scanner sc = new Scanner(System.in);

        System.out.println("What number do you want to see the price of: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(items[0] + " cost " + 10);
                break;
            case 2:
                System.out.println(items[1] + " cost " + 15);
                break;
            case 3:
                System.out.println(items[2] + " cost " + 25);
                break;
            case 4:
                System.out.println(items[3] + " cost " + 1);
                break;
            case 5:
                System.out.println(items[4] + " cost " + 20);
                break;
            case 6:
                System.out.println(items[5] + " cost " + 200);
                break;
            case 7:
                System.out.println(items[6] + " cost " + 1);
                break;
        }
    }
}
