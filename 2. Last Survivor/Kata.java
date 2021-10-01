public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
        var stringBuilder = new StringBuilder(letters);
        for (int coord : coords) {
            stringBuilder.deleteCharAt(coord);
        }

        return stringBuilder.toString();
    }
}