public class RecursionBasicQ1 {

    // Print n to 1 (decreasing order)

    public static void printDecreasing(int n) {

        // Base condition
        if (n == 0) {
            return;
        }

        System.out.println(n);   // Print first
        printDecreasing(n - 1);  // Then recursive call
    }

    public static void main(String args[]) {
        printDecreasing(5);

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