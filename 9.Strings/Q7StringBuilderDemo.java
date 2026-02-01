public class Q7StringBuilderDemo {

    /*
    =====================================
    STRINGBUILDER DEMO
    =====================================

    StringBuilder is MUTABLE.
    That means we can modify the same object again and again.

    Normal String in loop:
        str = str + ch;

    → This creates a NEW String object every time (slow).

    Using StringBuilder:
        sb.append(ch);

    → This modifies the SAME object (fast).
    */

    public static void main(String args[]) {

        // =====================================
        // CREATE STRINGBUILDER OBJECT
        // =====================================
        StringBuilder sb = new StringBuilder("");

        // =====================================
        // APPEND CHARACTERS FROM 'a' TO 'z'
        // =====================================
        for (char ch = 'a'; ch <= 'z'; ch++) {

            // append() adds character at the end
            sb.append(ch);
        }

        // Print final string
        System.out.println(sb);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n)

        Where n = number of appended characters (26 here).

        -------------------------------------

        Space Complexity: O(n)

        Because StringBuilder stores all characters inside it.
        */
    }
}
