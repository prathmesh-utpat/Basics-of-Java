public class RecursionHardQ11 {

    // Friends pairing problem
    public static int friendsPairing(int n) {

        // Base case
        if (n == 1 || n == 2) {
            return n;
        }

        // Case 1: single
        int single = friendsPairing(n - 1);

        // Case 2: pair
        int pair = (n - 1) * friendsPairing(n - 2);

        // Total ways
        return single + pair;

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Time Complexity: O(2^n)
        Because recursion branches.

        Space Complexity: O(n)
        Recursion stack depth = n.
        */
    }

    public static void main(String args[]) {

        int n = 4;
        System.out.println("Ways = " + friendsPairing(n));
    }
}