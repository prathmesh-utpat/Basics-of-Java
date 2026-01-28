import java.util.*;

public class SearchIn2DArray {

    // =====================================
    // FUNCTION TO SEARCH ELEMENT IN 2D ARRAY
    // =====================================
    public static boolean search(int[][] arr, int key) {

        // Loop through rows
        for (int i = 0; i < arr.length; i++) {

            // Loop through columns
            for (int j = 0; j < arr[0].length; j++) {

                // If key found
                if (arr[i][j] == key) {
                    System.out.println("Key found at position: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }

        // If not found after full traversal
        System.out.println("Key not found");
        return false;
    }

    public static void main(String args[]) {

        // =============================
        // CREATE 2D ARRAY
        // =============================
        int[][] arr = new int[3][3];

        int n = arr.length;
        int m = arr[0].length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 9 numbers for 3x3 matrix:");

        // =============================
        // INPUT
        // =============================
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // =============================
        // OUTPUT MATRIX
        // =============================
        System.out.println("Matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // =============================
        // SEARCH KEY
        // =============================
        search(arr, 5);   // 5 is the key

        sc.close();

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n * m)

        Because every element may be checked once
        in the worst case.

        Space Complexity: O(1) extra space

        Only constant variables are used.
        */
    }
}
