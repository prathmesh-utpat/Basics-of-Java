public class Q1PrintEachCharacterInString {

    // =====================================
    // FUNCTION TO PRINT EACH CHARACTER
    // =====================================
    public static void printCharacters(String name) {

        // Loop runs from index 0 to length-1
        for (int i = 0; i < name.length(); i++) {

            // charAt(i) returns the character at index i
            System.out.println(i + " -> " + name.charAt(i));
        }
    }

    public static void main(String[] args) {

        String name = "this for loop is used to print string";

        // Call function
        printCharacters(name);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n)

        Where n is the length of the string.
        Each character is accessed once.

        -------------------------------------

        Space Complexity: O(1) extra space

        Only loop variables are used.
        */
    }
}
