package Day22;

import java.util.Scanner;
import Day22.Arrow.*;

public class Fletcher {
    public static void body() {
        Scanner sc = new Scanner(System.in);

        String menu = String.join("\n"
                , "Arrow Class\'s"
                , "Elite - Steel, Plastic, 95cm"
                , "Beginner - Wood, Goose Feathers, 75cm"
                , "Marksman - Steel, Goose Feathers, 65cm"
                , ""
                , "Choose 1 for a pre-defined Arrow class or 2 for a custom type:"
        );

        System.out.println(menu);

        int choice = sc.nextInt();

        if (!(choice == 1 || choice == 2)) {
            System.out.println("Wrong choice!");
            return;
        }

        Arrow arrow = null;

        if (choice == 1) {
            System.out.println("\n\n1. Elite\n2. Beginner\n3. Marksman\n\nEnter the desired number:");
            choice = sc.nextInt();

            if (choice == 1) {
                arrow = Arrow.createEliteArrow();
            } else if (choice == 2) {
                arrow = Arrow.createBeginnerArrow();
            } else if (choice == 3) {
                arrow = Arrow.createMarksmanArrow();
            } else {
                System.out.println("An error occured!");
                return;
            }
        } else {
            System.out.println("Enter an Arrowhead type (Steel, Wood, Obsidian):");
            String arr_head = sc.nextLine().toUpperCase();
            ArrowHead arrow_head = null;

            for (ArrowHead i : ArrowHead.values()) {
                if (i.name().equals(arr_head)) {
                    arrow_head = i;
                    break;
                }
            }

            if (arrow_head == null) {
                System.out.println("Wrong input!");
                return;
            }

            System.out.println("Enter a Fletching Type (Plastic, Turkey Feathers, Goose feathers):");
            String fletching_type = sc.nextLine().toUpperCase();
            Fletching fletching = null;

            for (Fletching i : Fletching.values()) {
                if (i.name().equals(fletching_type)) {
                    fletching = i;
                    break;
                }
            }

            if (fletching == null) {
                System.out.println("Wrong input!");
                return;
            }

            System.out.println("Enter a length (Range 60-100cm):");
            int range = sc.nextInt();

            if (!(range >= 60 && range <= 100)) {
                System.out.println("Wrong input!");
                return;
            }

            arrow = new Arrow(arrow_head, fletching, range);


        }

        System.out.println("Cost: " + arrow.getCost());
        System.out.println("Arrow Head: " + arrow.getArrowHead());
        System.out.println("Fletching: " + arrow.getFletching());
        System.out.println("Shaft: " + arrow.getShaft());
    }
}
