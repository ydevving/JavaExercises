package Day21_1;

import java.util.Scanner;


public class FletcherArrows {
    public static void body() {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("Enter a length (Range 60-100cm)");
        int range = sc.nextInt();

        if (!(range >= 60 && range <= 100)) {
            System.out.println("Wrong input!");
            return;
        }

        Arrow arrow = new Arrow(arrow_head, fletching, range);

        System.out.println("Cost: " + arrow.getCost());
    }
}
