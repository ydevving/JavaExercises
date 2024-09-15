package Day3;

import java.util.Scanner;

public class Fix {
    public void body() {
        System.out.println("What kind of thing are we talking about?");
        Scanner input = new Scanner(System.in);
        String a = input.next(); // Type of thing
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String b = input.next(); // Description of thing
        String c = "Doom"; // The doom category
        String d = "3000"; // version
        System.out.println("The " + b + " " + a + " of " + c + " " + d + "!");

        // Answer: Put the last 2 strings in the println function
    }
}
