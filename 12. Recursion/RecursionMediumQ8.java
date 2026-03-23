// Q -write a function to find the last occurance of an element in an array
public class RecursionMediumQ8 {

    public static int lastOcc(int arr[], int key, int i) 
    {
        // Base case: If we have reached the end of the array, return -1
        if (i == arr.length) {
            return -1;
        }

        // Recursive case: Check if the current element is equal to the key
        int restArray = lastOcc(arr, key, i + 1); // Continue searching in the rest of the array

        if (restArray != -1) {
            return restArray; // If we found the key in the rest of the array, return that index
        } else if (arr[i] == key) {
            return i; // If we found the key at the current index, return it
        } else {
            return -1; // If we did not find the key at all, return -1
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

    public static void main(String args[]){
        int arr[] = {1,2,4,5,5,6,8,};
        System.out.println(lastOcc(arr,5,0));
    }
}
