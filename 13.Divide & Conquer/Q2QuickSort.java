public class Q2QuickSort {

    // Print array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Quick Sort function
    public static void QuickSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        // Partition index
        int pIdx = partition(arr, si, ei);

        QuickSort(arr, si, pIdx - 1); // left
        QuickSort(arr, pIdx + 1, ei); // right
    }

    // Partition function
    public static int partition(int arr[], int si, int ei) {

        int pivot = arr[ei]; // last element
        int i = si - 1;      // smaller elements position

        for (int j = si; j < ei; j++) {

            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // place pivot at correct position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 8, 2, 5};

        QuickSort(arr, 0, arr.length - 1);

        printarr(arr);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Average Time: O(n log n)
        Worst Time: O(n^2) (when array is sorted)

        Space Complexity: O(log n)
        Due to recursion stack
        */
    }
}