public class Q5UpdateIthBit {

    // =====================================
    // FUNCTION TO CLEAR I-th BIT
    // =====================================
    public static int clearIthBit(int n, int i) {

        // Create mask with only i-th bit ON
        int bitMask = 1 << i;

        // Invert mask → all 1s except i-th bit
        int invertedMask = ~bitMask;

        // AND clears the i-th bit
        return n & invertedMask;
    }

    // =====================================
    // FUNCTION TO UPDATE I-th BIT
    // newBit must be 0 or 1
    // =====================================
    public static int updateIthBit(int n, int i, int newBit) {

        // Step 1: Clear the i-th bit
        n = clearIthBit(n, i);

        // Step 2: Shift newBit to i-th position
        int bitMask = newBit << i;

        // Step 3: OR with n to set bit if newBit = 1
        return n | bitMask;
    }

    public static void main(String args[]) {

        // Update bit at position 2 in 10 (1010) to 1
        System.out.println(updateIthBit(10, 2, 1));

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(1)

        All bitwise operations are constant time.

        -------------------------------------

        Space Complexity: O(1)

        Only a few integer variables are used.
        */
    }
}
