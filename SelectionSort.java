public class SelectionSort {

    // Lecture – Selection Sort
    // Idea: Pick the smallest element from unsorted part
    // and place it at the beginning

    public static void selectionSort(int arr[]) {

        // Outer loop: moves boundary of sorted part
        for (int i = 0; i < arr.length - 1; i++) {

            // Assume current index has the smallest element
            int minpos = i;

            // Inner loop: find the smallest element in unsorted part
            for (int j = i + 1; j < arr.length; j++) {

                // Compare current element with smallest found so far
                if (arr[j] < arr[minpos]) {
                    minpos = j; // update index of smallest element
                }
            }

            // Swap smallest element with element at index i
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

        /*
         Time Complexity:
         Best Case: O(n^2)
         Average Case: O(n^2)
         Worst Case: O(n^2)

         Space Complexity: O(1)
         Reason: Sorting is done in-place, no extra array used
        */
    }

    public static void main(String args[]) {

        int arr[] = {2, 1, 4, 4, 5};

        selectionSort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
