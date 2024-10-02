package dad.codewars.kyu6;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {

        int lowestInt = args[0];

        for (int low : args) {
            if (lowestInt > low) {
                lowestInt = low;
            }
        }
        return lowestInt;
    }
}
