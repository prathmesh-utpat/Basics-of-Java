public class Q3SetIthBit {

    // =====================================
    // FUNCTION TO SET I-th BIT OF A NUMBER
    // =====================================
    public static int setIthBit(int n, int i) {

        // Create bitmask by shifting 1 left i times
        // Example: i = 2 → 1 << 2 = 100 (binary)
        int bitMask = 1 << i;

        // OR operation sets the bit to 1
        return n | bitMask;
    }

    public static void main(String args[]) {

        int result = setIthBit(5, 2);

        // Print updated number
        System.out.println(result);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(1)

        Bitwise OR is constant time.

        -------------------------------------

        Space Complexity: O(1)

        Only a few integer variables are used.
        */
    }
}
