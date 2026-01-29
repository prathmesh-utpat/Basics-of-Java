public class Q2PalindromeOrNot {

    // =====================================
    // CHECK IF STRING IS PALINDROME
    // =====================================
    public static boolean checkPalindrome(String str) {

        int n = str.length();

        // Only check till middle of string
        for (int i = 0; i < n / 2; i++) {

            // Compare characters from start and end
            if (str.charAt(i) != str.charAt(n - 1 - i)) {

                // Not a palindrome
                return false;
            }
        }

        // All characters matched
        return true;
    }

    public static void main(String args[]) {

        String str = "racecar";

        // Print result
        System.out.println(checkPalindrome(str));

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n)

        Where n is the length of the string.
        We check half the string → still O(n).

        -------------------------------------

        Space Complexity: O(1)

        No extra data structures used.
        */
    }
}
