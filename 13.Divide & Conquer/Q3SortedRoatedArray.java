class Q3SortedRotatedArray {

    public static int search(int arr[], int target, int si, int ei) {

        // Base case
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Case found
        if (arr[mid] == target) {
            return mid;
        }

        // Check if left half is sorted
        if (arr[si] <= arr[mid]) {

            // Case A: target in left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                // Case B: go right
                return search(arr, target, mid + 1, ei);
            }
        }

        // Right half is sorted
        else {

            // Case C: target in right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                // Case D: go left
                return search(arr, target, si, mid - 1);
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int targetIdx = search(arr, target, 0, arr.length - 1);

        System.out.println(targetIdx);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(log n)
        Because we eliminate half each time

        Space Complexity: O(log n)
        Due to recursion stack
        */
    }
}