public class Q2GetIthBit {

    // =====================================
    // FUNCTION TO GET I-th BIT OF A NUMBER
    // =====================================
    public static int getIthBit(int n, int i) {

        // Create bitmask by shifting 1 left i times
        // Example: i = 2 → 1 << 2 = 100 (binary)
        int bitMask = 1 << i;

        // If AND result is 0 → ith bit is 0
        if ((n & bitMask) == 0) {
            return 0;
        }

        // Otherwise ith bit is 1
        return 1;
    }

    public static void main(String args[]) {

        // Print ith bit of 10 at position 2
        System.out.println(getIthBit(10, 2));

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(1)

        Bitwise operations are constant time.

        -------------------------------------

        Space Complexity: O(1)

        Only a few integer variables are used.
        */
    }
}
