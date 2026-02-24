public class RecursionBasicQ4 {

    // Q - print sum of first n natural numbers

    public static int calSum(int n) {

        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive case
        int sum1 = calSum(n - 1);
        int sn = n + sum1;

        return sn;

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

    public static void main(String args[]) {

        int result = calSum(5);
        System.out.println("Sum = " + result);
    }
}