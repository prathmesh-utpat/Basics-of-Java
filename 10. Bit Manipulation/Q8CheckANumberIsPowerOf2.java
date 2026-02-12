public class Q8CheckANumberIsPowerOf2 {

    // =====================================
    // CHECK IF NUMBER IS POWER OF TWO
    // =====================================
    public static boolean isPowerOfTwo(int n) {

        // Power of two must be positive
        if (n <= 0) {
            return false;
        }

        // n & (n - 1) removes the lowest set bit
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {

        System.out.println(isPowerOfTwo(16)); // true
        System.out.println(isPowerOfTwo(18)); // false

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(1)

        Only constant-time bitwise operations.

        -------------------------------------

        Space Complexity: O(1)

        No extra data structures used.
        */
    }
}
