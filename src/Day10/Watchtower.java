package Day10;

public class Watchtower {
    public boolean body(int x, int y) {
        if (x == 0) {
            if (y == 0) {
                System.out.print("The enemy is here");
            } else if (y > 0) {
                System.out.print("The enemy is north");
            } else {
                System.out.print("The enemy is south");
            }
        } else if (y == 0) {
            if (x == 0) {
                System.out.print("The enemy is here");
            } else if (x > 0) {
                System.out.print("The enemy is east");
            } else {
                System.out.print("The enemy is west");
            }
        }

        if (x > 0 && y > 0) {
            System.out.println("The enemy is north-east");
        } else if (x < 0 && y > 0) {
            System.out.print("The enemy is north-west");
        } else if (x > 0 && y < 0) {
            System.out.print("The enemy is south-east");
        } else if (x < 0 && y < 0) {
            System.out.print("The enemy is south-west");
        }

        return true;
    }
}
