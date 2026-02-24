public class RecursionBasicQ3 {

    public static int factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Time Complexity: O(n)
        Because function calls itself n times.

        Space Complexity: O(n)
        Because recursion stack depth = n.
        */
    }

    public static void main(String args[]) {

        int n = 5;
        System.out.println("Factorial = " + factorial(n));
    }
}