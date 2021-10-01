public class Kata {
    private static java.util.HashMap<Character, Integer> leftSideTroops, rightSideTroops;

    // А как же инициализация через {}? 😥
    static {
        leftSideTroops = new java.util.HashMap<Character, Integer>();
        leftSideTroops.put('w', 4);
        leftSideTroops.put('p', 3);
        leftSideTroops.put('b', 2);
        leftSideTroops.put('s', 1);

        rightSideTroops = new java.util.HashMap<Character, Integer>();
        rightSideTroops.put('m', 4);
        rightSideTroops.put('q', 3);
        rightSideTroops.put('d', 2);
        rightSideTroops.put('z', 1);
    }

    public static String alphabetWar(String fight) {
        int leftSideScore = 0;
        int rightSideScore = 0;

        for (int i = 0; i < fight.length(); i++) {
            if (leftSideTroops.containsKey(fight.charAt(i))) {
                leftSideScore += leftSideTroops.get(fight.charAt(i));
            }
            else if (rightSideTroops.containsKey(fight.charAt(i))) {
                rightSideScore += rightSideTroops.get(fight.charAt(i));
            }
        }

        if (leftSideScore > rightSideScore) {
            return "Left side wins!";
        }
        else if (rightSideScore > leftSideScore) {
            return "Right side wins!";
        }

        return "Let's fight again!";
    }
  }
