public class Q1SpiralMatrix {

    //Q - print metrix in spiral manner 

    public static void printSpiral(int[][] matrix) {

        // ================================
        // INITIAL BOUNDARIES
        // ================================

        int startRow = 0;                     // first row index
        int startCol = 0;                     // first column index

        int endRow = matrix.length - 1;       // last row index
        int endCol = matrix[0].length - 1;    // last column index - matrix[0].length - 1; means n-1;

        // ================================
        // LOOP UNTIL ALL ELEMENTS PRINTED
        // ================================

        while (startRow <= endRow && startCol <= endCol) {

            // ================================
            // TOP BOUNDARY  →
            // ================================
            // Print elements from left to right
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // ================================
            // RIGHT BOUNDARY ↓
            // ================================
            // Print elements from top+1 to bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // ================================
            // BOTTOM BOUNDARY ←
            // ================================
            // Only run if more than one row remains
            if (startRow < endRow) {

                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            // ================================
            // LEFT BOUNDARY ↑
            // ================================
            // Only run if more than one column remains
            if (startCol < endCol) {

                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            // ================================
            // SHRINK THE BOUNDARIES
            // ================================

            startRow++;
            startCol++;

            endRow--;
            endCol--;
        }

        System.out.println();
    }

    public static void main(String args[]) {

        int[][] matrix = {
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Call spiral printing function
        printSpiral(matrix);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(r * c)

        Where:
        r = number of rows
        c = number of columns

        Every element of the matrix is visited exactly once.

        -------------------------------------

        Space Complexity: O(1) extra space

        Only boundary variables are used.
        No additional data structures.
        */
    }
}
