package Day15;

public class Laws {
    public static void body() {
        int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
        int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.

        for (int n : array) {
            if (n < currentSmallest)
                currentSmallest = n;
        }

        System.out.println(currentSmallest);

        int total = 0;

        for (int n : array)
            total += n;

        double average = (double)total / array.length;
        System.out.println(average);
    }
}
