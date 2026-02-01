public class Q6CompareFunction {

    // =====================================
    // PRINT LARGEST STRING LEXICOGRAPHICALLY
    // =====================================
    public static void main(String args[]) {

        String[] fruit = {"apple", "mango", "banana"};

        // Assume first string is largest initially
        String largest = fruit[0];

        // Compare with remaining strings
        for (int i = 1; i < fruit.length; i++) {

            // compareTo() returns:
            // > 0 if largest > fruit[i]
            // < 0 if largest < fruit[i]
            // 0 if both equal

            if (largest.compareTo(fruit[i]) < 0) {
                largest = fruit[i];
            }
        }

        // Print final largest string
        System.out.println(largest);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n * m)

        Where:
        n = number of strings
        m = average length of each string

        Each comparison may take O(m) time.

        -------------------------------------

        Space Complexity: O(1)

        Only one variable is used.
        */
    }
}
