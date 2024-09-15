
import Day1.HelloWorld;
import Day2_1.Print;
import Day2_2.Prints;
import Day2_3.UserInput;
import Day3.Fix;
import Day4.Types;
import Day5_1.Variables;
import Day6.Eggs;
import Day7.Dominion;
import Day8.Defense;
import Day9.Clocktower;
import Day10.Watchtower;
import Day11_1.Inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Target row?");
        int target_row = scanner.nextInt();
        System.out.println("Target column?");
        int target_column = scanner.nextInt();

        Defense.body(target_row,  target_column);
    }
}