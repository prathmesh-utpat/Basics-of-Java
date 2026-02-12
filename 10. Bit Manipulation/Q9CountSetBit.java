public class Q9CountSetBit {

    // =====================================
    // FUNCTION TO COUNT SET BITS (1s)
    // =====================================
    public static int countSetBits(int n) {

        int count = 0;

        // Keep checking until number becomes 0
        while (n > 0) {

            // If last bit is 1, increment count
            if ((n & 1) != 0) {
                count++;
            }

            // Right shift to check next bit
            n = n >> 1;
        }

        return count;
    }

    public static void main(String args[]) {

        System.out.println(countSetBits(10)); // 1010 → 2

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(log n)

        Because we shift the number right until it becomes 0.
        Number of bits ≈ log₂(n).

        -------------------------------------

        Space Complexity: O(1)

        Only a few variables are used.
        */
    }
}
