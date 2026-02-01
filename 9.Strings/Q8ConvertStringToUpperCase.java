public class Q8ConvertStringToUpperCase {

    // ============================================
    // CONVERT FIRST LETTER OF EACH WORD TO UPPERCASE
    // ============================================
    public static String toUpperCaseWords(String str1) {

        // StringBuilder is used for efficient string modification
        StringBuilder sb = new StringBuilder("");

        // Convert first character to uppercase (if exists)
        char ch = Character.toUpperCase(str1.charAt(0));
        sb.append(ch);

        // ============================================
        // LOOP THROUGH REMAINING CHARACTERS
        // ============================================
        for (int i = 1; i < str1.length(); i++) {

            // If current character is space and next character exists
            if (str1.charAt(i) == ' ' && i < str1.length() - 1) {

                // Append space
                sb.append(str1.charAt(i));

                // Move to next character
                i++;

                // Append uppercase of next character
                sb.append(Character.toUpperCase(str1.charAt(i)));

            } else {

                // Append current character normally
                sb.append(str1.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {

        String str1 = "hi i am prathmesh";

        System.out.println(toUpperCaseWords(str1));

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n)

        Where n is the length of the string.
        Each character is processed once.

        -------------------------------------

        Space Complexity: O(n)

        Because a new modified string is created.
        */
    }
}
