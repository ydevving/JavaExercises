package Day2_3;

import java.util.Scanner;

public class UserInput {
    public void input() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Bread is ready.");
        System.out.println("Who is the bread for?");

        String user = myObj.nextLine();
        System.out.println("Username is " + user);
    }
}
