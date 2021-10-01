public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {
        int diff = yearTo - birth;

        if (diff == 0) {
            return "You were born this very year!";
        }
        else if (diff > 0) {
            return String.format("You are %d year%s old.", diff, DetermineEnding(diff));
        }
        else {
            diff = Math.abs(diff);
            return String.format("You will be born in %d year%s.", diff, DetermineEnding(diff));
        }
    }

    private static String DetermineEnding(int diff) {
        return (diff == 1) ? "" : "s";
    }
}