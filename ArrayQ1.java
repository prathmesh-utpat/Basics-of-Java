

public class ArrayQ1 {

    // Method to find the maximum element in an array
    public static int maxnumber(int arr[]) {

        // Step 1: Assume first element is the largest
        int largest = arr[0];

        // Step 2: Start loop from index 1 (second element)
        for (int i = 1; i < arr.length; i++) {

            // Step 3: Compare current element with largest
            if (largest < arr[i]) {

                // Step 4: Update largest if bigger value found
                largest = arr[i];
            }
        }

        // Step 5: Return the largest value after loop ends
        return largest;
    }

    public static void main(String[] args) {

        // Step 6: Declare and initialize the array
        int arr[] = {10, 20, 30, 40, 50};

        // Step 7: Call maxnumber method and print result
        System.out.print("Largest value in array : " + maxnumber(arr));
    }
}
