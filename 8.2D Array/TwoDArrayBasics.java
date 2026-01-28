public class TwoDArrayBasics {

    public static void main(String[] args) {

        // ================================
        // STEP 1: CREATE A 2D ARRAY
        // ================================
        // This creates a 2D array with 2 rows and 3 columns
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // ================================
        // STEP 2: ACCESS ELEMENTS
        // WITHOUT USING LOOPS
        // ================================
        // Accessing each element directly using row and column index

        System.out.println("Accessing without loops:");

        System.out.println(matrix[0][0]); // row 0, column 0 → 10
        System.out.println(matrix[0][1]); // row 0, column 1 → 20
        System.out.println(matrix[0][2]); // row 0, column 2 → 30

        System.out.println(matrix[1][0]); // row 1, column 0 → 40
        System.out.println(matrix[1][1]); // row 1, column 1 → 50
        System.out.println(matrix[1][2]); // row 1, column 2 → 60

        // ================================
        // STEP 3: ACCESS ELEMENTS
        // USING FOR LOOPS
        // ================================
        // Outer loop → goes through rows
        // Inner loop → goes through columns

        System.out.println("\nAccessing using loops:");

        for (int i = 0; i < matrix.length; i++) {          // rows

            for (int j = 0; j < matrix[0].length; j++) {   // columns

                System.out.print(matrix[i][j] + " ");
            }

            // Move to next line after printing one row
            System.out.println();
        }

        /*
        ================================
        TIME & SPACE COMPLEXITY
        ================================

        Accessing without loops:
        Time Complexity: O(1) per access
        Space Complexity: O(1)

        Accessing using loops:
        Time Complexity: O(r * c)
        Where r = number of rows and c = number of columns

        Space Complexity: O(1) extra space
        (No additional data structures are used beyond the array)
        */
    }
}
