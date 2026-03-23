public class RecursionHardQ10 {

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {

        // Base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Current character
        char currChar = str.charAt(idx);

        // Check if already visited
        if (map[currChar - 'a'] == true) {
            // Skip duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // Add to result and mark visited
            map[currChar - 'a'] = true;
            newStr.append(currChar);

            removeDuplicates(str, idx + 1, newStr, map);
        }

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Time Complexity: O(n)
        Each character is processed once.

        Space Complexity: O(n)
        Due to recursion stack and result string.
        */
    }

    public static void main(String args[]) {

        String str = "appnnacollege";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}