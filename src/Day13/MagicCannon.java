package Day13;

public class MagicCannon {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void body() {

        for (int i = 1; i <= 100; i++) {
            String choice;

            if (i % 3 == 0 && i % 5 == 0) {
                choice = ANSI_BLUE + "Combined" + ANSI_RESET;
            } else if (i % 3 == 0) {
                choice = ANSI_RED + "Fire" + ANSI_RESET;
            } else if (i % 5 == 0) {
                choice = ANSI_YELLOW + "Electric" + ANSI_RESET;
            } else {
                choice = "Normal";
            }

            System.out.println(i + ". " + choice);
        }
    }
}
