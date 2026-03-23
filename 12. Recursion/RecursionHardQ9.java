public class RecursionHardQ9 {

    // Tiling problem function
    public static int tiling(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Vertical placement
        int vertical = tiling(n - 1);

        // Horizontal placement
        int horizontal = tiling(n - 2);

        // Total ways
        return vertical + horizontal;

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Time Complexity: O(2^n)
        Because recursion branches into 2 calls.

        Space Complexity: O(n)
        Recursion stack depth = n.
        */
    }

    public static void main(String args[]) {

        int n = 4;
        System.out.println("Ways = " + tiling(n));
    }
}