public class ArrayQ3 {

    // Lecture 10 – Print all pairs of an array
    // Pair means: every element combined with all elements after it

    public static void pairs(int arr[]) {

        // Outer loop: picks the current element one by one
        for (int i = 0; i < arr.length; i++) {

            // Store current element (fixed for inner loop)
            int current = arr[i];

            // Inner loop: pairs current element with remaining elements
            for (int j = i + 1; j < arr.length; j++) {

                // Print the pair (current, arr[j])
                System.out.println("(" + current + " , " + arr[j] + ")");
            }

            // New line after completing pairs for one element
            System.out.println();
        }
    }

    public static void main(String args[]) {

        // Given array
        int arr[] = {1, 2, 3, 4, 5};

        // Call pairs function
        pairs(arr);
    }
}
