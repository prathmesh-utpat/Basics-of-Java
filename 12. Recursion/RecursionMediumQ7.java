// write a function to find first occurance of an element in an array
public class RecursionMediumQ7 {
    public static int firstOcc(int arr[], int key, int i) 
    {
        // Base case: If we have reached the end of the array, return -1
        if (i == arr.length) {
            return -1;
        }

        // Recursive case: Check if the current element is equal to the key
        if (arr[i] == key) {
            return i; // Return the index of the first occurrence
        } else {
            return firstOcc(arr, key, i + 1); // Continue searching in the rest of the array
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
        int key = 3;
        int result = firstOcc(arr, key, 0);
        System.out.println("First occurrence of " + key + " is at index: " + result);
    }
    
}
