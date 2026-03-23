public class RecursionHardQ12 {

    // Print binary strings without consecutive 1s
    public static void printBinary(int n, int lastPlace, String str) {

        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always allowed → place '0'
        printBinary(n - 1, 0, str + "0");

        // Place '1' only if last was 0
        if (lastPlace == 0) {
            printBinary(n - 1, 1, str + "1");
        }

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Time Complexity: O(2^n)
        Generating all valid combinations.

        Space Complexity: O(n)
        Recursion stack depth.
        */
    }

    public static void main(String args[]) {

        int n = 3;
        printBinary(n, 0, "");
    }
}