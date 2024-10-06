package Day22;

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
    private ArrowHead arrow_head;
    private int shaft;
    private Fletching fletching;
    Scanner sc = new Scanner(System.in);

    Arrow(ArrowHead arrow_head, Fletching fletching, int shaft_length) {
        this.arrow_head = arrow_head;
        this.fletching = fletching;
        this.shaft = shaft_length;
    }

    public static Arrow createEliteArrow() {
        Arrow arrow = new Arrow(ArrowHead.STEEL, Fletching.PLASTIC, 95);
        return arrow;
    }

    public static Arrow createBeginnerArrow() {
        Arrow arrow = new Arrow(ArrowHead.WOOD, Fletching.GOOSE_FEATHERS, 75);
        return arrow;
    }

    public static Arrow createMarksmanArrow() {
        Arrow arrow = new Arrow(ArrowHead.STEEL, Fletching.GOOSE_FEATHERS, 65);
        return arrow;
    }

    public ArrowHead getArrowHead() {
        return this.arrow_head;
    }

    public int getShaft() {
        return this.shaft;
    }

    public Fletching getFletching() {
        return this.fletching;
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
