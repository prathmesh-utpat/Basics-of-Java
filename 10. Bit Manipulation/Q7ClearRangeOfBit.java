public class Q7ClearRangeOfBit {

    /*
    =====================================
    CLEAR BITS FROM i TO j (INCLUSIVE)
    =====================================

    Example:
    n = 10  -> 1010
    i = 1, j = 2

    Clear bits in that range and return result.
    */

    public static int clearRangeOfBits(int n, int i, int j) {

        // -------------------------------------
        // Step 1:
        // Create mask with all 1s before j
        // ~0 = 11111111....
        // Shift left by (j + 1)
        // a = 111111000... (j+1 zeros)
        int a = (~0) << (j + 1);

        // -------------------------------------
        // Step 2:
        // Create mask with i ones at right
        // Example: i = 2 → (1 << 2) = 100
        // b = 100 - 1 = 011
        int b = (1 << i) - 1;

        // -------------------------------------
        // Step 3:
        // Combine both masks
        // Middle bits become 0
        int bitMask = a | b;

        // -------------------------------------
        // Step 4:
        // AND with number clears range i to j
        return n & bitMask;
    }

    public static void main(String args[]) {

        // Clear bits from position 2 to 7 in 10
        System.out.println(clearRangeOfBits(10, 2, 7));

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(1)

        All operations are bitwise and constant time.

        -------------------------------------

        Space Complexity: O(1)

        Only a few integer variables are used.
        */
    }
}
