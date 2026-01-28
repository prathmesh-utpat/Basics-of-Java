public class Q2DiagonalSumOfMatrix {

    // ============================================
    // FUNCTION TO CALCULATE DIAGONAL SUM
    // ============================================
    public static int diagonalSum(int[][] matrix) {

        int sum = 0; // variable to store sum of diagonal elements

        int n = matrix.length; // size of square matrix

        // ============================================
        // SINGLE LOOP → O(n) APPROACH
        // ============================================
        // For every row i:
        // 1) Primary diagonal element → matrix[i][i]
        // 2) Secondary diagonal element → matrix[i][n - 1 - i]

        for (int i = 0; i < n; i++) {

            // Add primary diagonal element
            sum += matrix[i][i];

            // Add secondary diagonal element
            // Avoid double-counting middle element when n is odd
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static void main(String args[]) {

        int[][] matrix = {
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // ============================================
        // CALL FUNCTION AND PRINT RESULT
        // ============================================
        int result = diagonalSum(matrix);

        System.out.println("Diagonal Sum = " + result);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n)

        Because only one loop is used for an n x n matrix.

        -------------------------------------

        Space Complexity: O(1)

        Only a few variables are used.
        No extra data structures.
        */
    }
}
