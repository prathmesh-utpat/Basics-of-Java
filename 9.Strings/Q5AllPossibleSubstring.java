public class Q5AllPossibleSubstring {

     

    public static void printAllSubstrings(String str) {

        int n = str.length();

        // =====================================
        // OUTER LOOP → STARTING INDEX = i
        // =====================================
        for (int i = 0; i < n; i++) {

            // =====================================
            // INNER LOOP → ENDING INDEX = j
            // =====================================
            for (int j = i + 1; j <= n; j++) {

                // substring(i, j) prints from i to j-1
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String args[]) {

        String str = "abc";

        printAllSubstrings(str);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n^3)

        There are O(n^2) substrings and
        creating each substring costs O(n) time.

        -------------------------------------

        Space Complexity: O(1) extra space
        (Ignoring output storage)
        */
    }
}

    

