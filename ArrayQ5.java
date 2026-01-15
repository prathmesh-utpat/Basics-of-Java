public class ArrayQ5 {

    // Lecture 12 – Maximum Subarray Sum (Brute Force Approach)
    // Subarray = continuous part of array

    public static void MaxSubArraySum(int numbers[]) {

        // Initialize maxsum with smallest possible value
        int maxsum = Integer.MIN_VALUE;

        // Outer loop: decides starting index of subarray
        for (int i = 0; i < numbers.length; i++) {

            int start = i; // starting index

            // Middle loop: decides ending index of subarray
            for (int j = i; j < numbers.length; j++) {

                int end = j;       // ending index
                int currentsum = 0; // stores sum of current subarray

                // Inner loop: calculates sum from start to end
                for (int k = start; k <= end; k++) {
                    currentsum = currentsum + numbers[k];
                }

                // Print current subarray sum (for understanding)
                System.out.println(currentsum);

                // Update maxsum if current sum is greater
                if (currentsum > maxsum) {
                    maxsum = currentsum;
                }
            }
        }

        // Print maximum subarray sum
        System.out.println("Maximum Subarray Sum = " + maxsum);

        /*
         Time Complexity: O(n^3)
         Reason: Three nested loops (start, end, sum)

         Space Complexity: O(1)
         Reason: Only constant extra variables used
        */
    }

    public static void main(String args[]) {

        // Given array
        int numbers[] = {10, 20, 30, 40, 50};

        // Call function
        MaxSubArraySum(numbers);
    }
}
