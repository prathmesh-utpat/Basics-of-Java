public class CountingSort {

    // Lecture – Counting Sort
    // Works only for NON-NEGATIVE integers
    // Used when range of numbers is small

    public static void countingSort(int arr[]) {

        // Step 1: Find the largest element in the array
        // This helps decide the size of count array
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Step 2: Create count array of size (largest + 1)
        // Each index represents the number
        // Value at index represents frequency
        int count[] = new int[largest + 1];

        // Step 3: Store frequency of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Step 4: Rebuild the sorted array using count array
        int j = 0; // index for original array

        for (int i = 0; i < count.length; i++) {

            // While frequency of number i is greater than 0
            while (count[i] > 0) {
                arr[j] = i; // place the number in array
                j++;
                count[i]--; // reduce frequency
            }
        }

        /*
         Time Complexity: O(n + k)
         Reason:
         - O(n) to count elements
         - O(k) to rebuild array
         (k = range of numbers)

         Space Complexity: O(k)
         Reason:
         - Extra count array of size (largest + 1)
        */
    }

    public static void main(String args[]) {

        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        countingSort(arr);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
