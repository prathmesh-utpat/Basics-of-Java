public class BitWiseOperators {

    public static void main(String args[]) {

        // =====================================
        // BITWISE AND (&)
        // =====================================
        // 5  -> 0101
        // 6  -> 0110
        // &  -> 0100  -> 4
        System.out.println(5 & 6);

        // =====================================
        // BITWISE OR (|)
        // =====================================
        // 5  -> 0101
        // 6  -> 0110
        // |  -> 0111  -> 7
        System.out.println(5 | 6);

        // =====================================
        // BITWISE XOR (^)
        // =====================================
        // 5  -> 0101
        // 6  -> 0110
        // ^  -> 0011  -> 3
        System.out.println(5 ^ 6);

        // =====================================
        // BITWISE NOT (~)
        // =====================================
        // ~5 flips all bits of 5
        // 5 in 32-bit = 00000000 00000000 00000000 00000101
        // ~5         = 11111111 11111111 11111111 11111010
        // Result = -6 (two's complement form)
        System.out.println(~5);

        // =====================================
        // LEFT SHIFT (<<)
        // =====================================
        // 5 << 1 = 10
        // 5 << 2 = 20
        // 5 << 6 = 320
        // Shift left multiplies by 2^shift
        System.out.println(5 << 6);

        // =====================================
        // RIGHT SHIFT (>>)
        // =====================================
        // 5 >> 1 = 2
        // 5 >> 2 = 1
        // 5 >> 6 = 0
        // Shift right divides by 2^shift
        System.out.println(5 >> 6);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        All bitwise operations run in:

        Time Complexity: O(1)
        Space Complexity: O(1)

        Because they operate directly on fixed-size integers.
        */
    }
}
