public class Q6ClearLastIBits {

    // =====================================
    // FUNCTION TO CLEAR LAST i BITS
    // =====================================
    public static int clearLastIBits(int n, int i) {

        // Create mask where last i bits are 0
        // -1 in binary = all 1s
        // Shifting left by i makes last i bits 0
        int bitMask = (-1) << i;

        // AND with number clears last i bits
        return n & bitMask;
    }

    public static void main(String args[]) {

        // Clear last 2 bits of 15 (1111)
        System.out.println(clearLastIBits(15, 2));

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(1)

        Bitwise operations take constant time.

        -------------------------------------

        Space Complexity: O(1)

        Only a few integer variables are used.
        */
    }
}
