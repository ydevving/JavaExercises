package Day14;

import java.util.Scanner;
import Day16.AskNumber;

public class Replicator {
    public static void body() {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = AskNumber.askForNumber("Enter number " + (i + 1) + ": ");
        }

        int[] b = new int[5];

        for (int i = 0; i < 5; i++) {
            b[i] = a[i];
        }

        System.out.println("Array a (1): ");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Array b (2): ");
        for (int i = 0; i < 5; i++) {
            System.out.println(b[i]);
        }
    }
}
