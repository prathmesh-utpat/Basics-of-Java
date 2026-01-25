public class InsertionSort {

    // Lecture – Insertion Sort
    // Idea: Insert each element into its correct position
    // in the already sorted part of the array

    public static void insertionSort(int arr[]) {

        // Loop starts from index 1 because first element is already sorted
        for (int i = 1; i < arr.length; i++) {

            // Store current element to be inserted
            int current = arr[i];

            // Previous index (last index of sorted part)
            int prev = i - 1;

            // Shift elements that are greater than current to the right
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert current element at correct position
            arr[prev + 1] = current;
        }

        /*
         Time Complexity:
         Best Case: O(n)      // already sorted
         Average Case: O(n^2)
         Worst Case: O(n^2)   // reverse sorted

         Space Complexity: O(1)
         Reason: In-place sorting, no extra array used
        */
    }

    public static void main(String args[]) {

        int arr[] = {5, 4, 1, 3, 2};

        insertionSort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
