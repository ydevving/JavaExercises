package Day8;

import java.awt.Toolkit;
import java.util.Scanner;

public class Defense {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void body(int row, int column) {
        int left_row = row;
        int left_column = column - 1;

        int right_row = row;
        int right_column = column + 1;

        int up_row = row + 1;
        int up_column = column;

        int down_row = row - 1;
        int down_column = column;

        System.out.println("Deploy to:");
        System.out.println(ANSI_GREEN);
        System.out.println("(" + left_row + ", " + left_column + ")");
        System.out.println("(" + down_row + ", " + down_column + ")");
        System.out.println("(" + right_row + ", " + right_column + ")");
        System.out.println("(" + up_row + ", " + up_column + ")");
        System.out.println(ANSI_RESET);

        Toolkit.getDefaultToolkit().beep();
    }
}
