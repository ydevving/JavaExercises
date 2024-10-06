package Day11_2;

import java.util.Scanner;

public class Discounted {
    public static void body() {
        String[] items = {"Rope", "Torches", "Climbing Equipment", "Clean Water", "Machete", "Canoe", "Food Supplies"};

        String menu = "1. " + items[0] + "\n" + "2. " + items[1] + "\n" + "3. " + items[2] + "\n" + "4. " + items[3] + "\n" +
                "5. " + items[4] + "\n" + "6. " + items[5] + "\n" + "7. " + items[6] + "\n";

        System.out.println(menu);

        Scanner sc = new Scanner(System.in);

        System.out.println("What number do you want to see the price of: ");
        int choice = sc.nextInt();

        String name = "yous";

        System.out.println("What is your name: ");
        String name_input = sc.next().toLowerCase();
        System.out.println(name_input);

        int price = 0;
        switch (choice) {
            case 1:
                price = name_input.equals(name) ? 10 / 2 : 10;
                System.out.println(items[0] + " cost " + price);
                break;
            case 2:
                price = name_input.equals(name) ? 15 / 2 : 15;
                System.out.println(items[1] + " cost " + price);
                break;
            case 3:
                price = name_input.equals(name) ? 25 / 2 : 25;
                System.out.println(items[2] + " cost " + price);
                break;
            case 4:
                price = name_input.equals(name) ? 1 / 2 : 1;
                System.out.println(items[3] + " cost " + price);
                break;
            case 5:
                price = name_input.equals(name) ? 20 / 2 : 20;
                System.out.println(items[4] + " cost " + price);
                break;
            case 6:
                price = name_input.equals(name) ? 200 / 2 : 200;
                System.out.println(items[5] + " cost " + price);
                break;
            case 7:
                price = name_input.equals(name) ? 1 / 2 : 1;
                System.out.println(items[6] + " cost " + price);
                break;
        }
    }
}
