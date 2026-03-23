//Q-check if an array is sorted or not 
public class RecursionMediumQ6 {

    public static boolean isSorted(int arr[], int i) 
    {
        // Base case: If we have reached the end of the array, it is sorted
        if (i == arr.length - 1) {
            return true;
        }

        // Recursive case: Check if the current element is less than or equal to the next element
        if (arr[i] <= arr[i + 1]) {
            return isSorted(arr, i + 1);
        } else {
            return false; // If we find any pair that is not in order, return false
        }

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Time Complexity: O(n)
        We check each element once.

        Space Complexity: O(n)
        Because of the recursion stack depth = n.
        */
    }
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5};
        boolean result = isSorted(arr, 0);
        System.out.println("Is the array sorted? " + result);
    }
    
}
