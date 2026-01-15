
    import java.util.Arrays;
import java.util.Collections;

public class InBuiltSort {

    public static void main(String args[]) {

        // ==================================================
        // 1️⃣ In-built sort for primitive array (int[])
        // ==================================================

        int arr1[] = {5, 4, 1, 3, 2};

        // Sort array in ascending order
        Arrays.sort(arr1);

        // Print sorted array
        System.out.print("Primitive int[] sorted: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        /*
         Time Complexity: O(n log n)
         Space Complexity: O(log n)
         Reason: Dual-Pivot QuickSort is used for primitive arrays
        */

        // --------------------------------------------------


        // ==================================================
        // 2️⃣ In-built sort for object array (Integer[])
        // ==================================================

        Integer arr2[] = {5, 4, 1, 3, 2};

        // Sort object array in ascending order
        Arrays.sort(arr2);

        System.out.print("Object Integer[] sorted: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        /*
         Time Complexity:
         Best Case: O(n)
         Average Case: O(n log n)
         Worst Case: O(n log n)

         Space Complexity: O(n)
         Reason: TimSort is used for object arrays
        */

        // --------------------------------------------------


        // ==================================================
        // 3️⃣ In-built sort in descending order
        // ==================================================

        Integer arr3[] = {5, 4, 1, 3, 2};

        // Sort array in descending order
        Arrays.sort(arr3, Collections.reverseOrder());

        System.out.print("Descending order sort: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        /*
         Time Complexity: O(n log n)
         Space Complexity: O(n)
         Reason: Reverse order sorting using comparator
        */
    }
}

    

