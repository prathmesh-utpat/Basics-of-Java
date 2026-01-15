public class BubbleSort {

    // Lecture – Bubble Sort
    // Sorts array in ascending order

    public static void bubbleSort(int arr[]) {

        // Outer loop: number of passes
        // After each pass, one largest element goes to the end
        for (int i = 0; i < arr.length - 1; i++) {

            // Inner loop: compares adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {

                // If current element is greater than next element
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        /*
         Time Complexity:
         Worst Case: O(n^2)  (array in reverse order)
         Average Case: O(n^2)
         Best Case: O(n^2)  (without optimization)

         Space Complexity: O(1)
         Reason: Sorting is done in the same array (in-place)
        */
    }

    public static void main(String args[]) {

        int arr[] = {5, 3, 4, 1, 2};

        // Call bubble sort
        bubbleSort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
