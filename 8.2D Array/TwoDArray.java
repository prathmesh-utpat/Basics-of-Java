import java.util.*;

public class TwoDArray {

    public static void main(String[] args) {

        // Creation of 2D array (3 rows, 3 columns)
        int arr[][] = new int[3][3];

        // Number of rows
        int n = arr.length;

        // Number of columns
        int m = arr[0].length;

        // Scanner for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 numbers:");


        // =====================
        // INPUT
        // =====================

        // Loop for rows
        for (int i = 0; i < n; i++) {

            // Loop for columns
            for (int j = 0; j < m; j++) {

                // Take input for each cell
                arr[i][j] = sc.nextInt();
            }
        }

        // =====================
        // OUTPUT
        // =====================

        // Loop for rows
        for (int i = 0; i < n; i++) {

            // Loop for columns
            for (int j = 0; j < m; j++) {

                // Print element
                System.out.print(arr[i][j] + " ");
            }

            // New line after each row
            System.out.println();
        }

        /*
         Time Complexity: O(n * m)
         Reason: Every element is visited once

         Space Complexity: O(n * m)
         Reason: 2D array storage
        */
    }
}
