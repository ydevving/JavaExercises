package Day17;

public class Countdown {
    public static void body() {
        int result = countdown(10);
    }

    public static int countdown(int loopuntil) {
        if (loopuntil > 0) {
            System.out.println(loopuntil);
            countdown(loopuntil - 1);
        }

        return 0;
    }
}
