public class Q1CheckEvenOdd {

    // =====================================
    // FUNCTION TO CHECK EVEN OR ODD
    // USING BITWISE OPERATOR
    // =====================================
    public static void evenOdd(int n) {

        // Bitmask 1 is used to check the last binary digit
        // If last bit is 0 → even
        // If last bit is 1 → odd
        if ((n & 1) == 0) {

            // When AND with 1 gives 0 → even number
            System.out.println("Even Number");

        } else {

            // When AND with 1 gives 1 → odd number
            System.out.println("Odd Number");
        }
    }

    public static void main(String args[]) {

        int number = 5;
        

        // Call function
        evenOdd(number);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(1)

        Because bitwise AND is a constant-time operation.

        -------------------------------------

        Space Complexity: O(1)

        Only constant extra variables are used.
        */
    }
}
