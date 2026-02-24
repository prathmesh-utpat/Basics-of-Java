public class RecursionBasicQ2 {

    // Print 1 to n (increasing order)

    public static void printInc(int n) {

        // Base condition
        if (n == 0) {
            return;
        }

        printInc(n - 1);          // First go to smallest
        System.out.println(n);    // Print during backtracking
    }

    public static void main(String args[]) {
        printInc(5);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Time Complexity: O(n)
        One recursive call per number.

        Space Complexity: O(n)
        Because recursion stack depth = n.
        */
    }
}