package Day21_1;

import java.util.Scanner;

enum ArrowHead {
    STEEL,
    WOOD,
    OBSIDIAN
}

enum Fletching {
    PLASTIC,
    TURKEY_FEATHERS,
    GOOSE_FEATHERS
}

public class Arrow {
    public ArrowHead arrow_head;
    public int shaft;
    public Fletching fletching;
    Scanner sc = new Scanner(System.in);

    Arrow(ArrowHead arrow_head, Fletching fletching, int shaft_length) {
        this.arrow_head = arrow_head;
        this.fletching = fletching;
        this.shaft = shaft_length;
    }

    public float getCost() {
        int cost = 0;

        switch (arrow_head) {
            case STEEL:
                cost += 10;
                break;
            case WOOD:
                cost += 3;
                break;
            case OBSIDIAN:
                cost += 5;
                break;
        }

        switch (fletching) {
            case PLASTIC:
                cost += 10;
                break;
            case TURKEY_FEATHERS:
                cost += 5;
                break;
            case GOOSE_FEATHERS:
                cost += 3;
                break;
        }

        cost += this.shaft * 0.05;

        return cost;
    }
}
