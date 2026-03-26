public class Q1MergeSort {

    // Print array
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Merge Sort function
    public static void mergesort(int arr[], int si, int ei) {

        // Base Case
        if (si >= ei) {
            return;
        }

        // Divide
        int mid = si + (ei - si) / 2;

        mergesort(arr, si, mid);       // left
        mergesort(arr, mid + 1, ei);   // right

        // Combine
        merge(arr, si, mid, ei);
    }

    // Merge function
    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;       // left pointer
        int j = mid + 1;  // right pointer
        int k = 0;        // temp pointer

        // Compare and fill temp
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Remaining left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Main
    public static void main(String args[]) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        mergesort(arr, 0, arr.length - 1);

        printarr(arr);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n log n)
        Divide log n times + merge O(n)

        Space Complexity: O(n)
        Extra array used
        */
    }
}