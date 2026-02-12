public class Q4ClearIthBit {

    // =====================================
    // FUNCTION TO CLEAR I-th BIT OF A NUMBER
    // =====================================
    public static int clearIthBit(int n, int i) {

        // Step 1:
        // Create mask with only i-th bit ON
        // Example: i = 1 → 1 << 1 = 0010
        int bitMask = 1 << i;

        // Step 2:
        // Take NOT of mask → all 1s except i-th bit
        // ~(0010) = ...1101
        int invertedMask = ~bitMask;

        // Step 3:
        // AND with number clears the i-th bit
        return n & invertedMask;
    }

    public static void main(String args[]) {

        // Clear bit at position 1 in 10 (1010)
        System.out.println(clearIthBit(10, 1));

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(1)

        Bitwise operations run in constant time.

        -------------------------------------

        Space Complexity: O(1)

        Only a few integer variables are used.
        */
    }
}
