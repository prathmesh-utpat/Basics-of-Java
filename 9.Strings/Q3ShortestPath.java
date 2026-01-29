public class Q3ShortestPath {

    public static float shortestPath(String str) {

        int x = 0;
        int y = 0;

        // Process entire string first
        for (int i = 0; i < str.length(); i++) {

            char dir = str.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {   // 'E'
                x++;
            }
        }

        // Calculate distance AFTER finishing all moves
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String args[]) {

        String str = "WNEENESNNN";

        System.out.println(shortestPath(str));

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n)

        Where n is the length of the string.
        Each character is processed once.

        -------------------------------------

        Space Complexity: O(1)

        Only x and y coordinates are used.
        */
    }
}
