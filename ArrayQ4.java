public class ArrayQ4 {

    // Lecture 11 – Print all subarrays of an array
    // Subarray = continuous part of an array

    public static void printSubarrays(int number[]) {

        // Outer loop: fixes the starting index of subarray
        for (int i = 0; i < number.length; i++) {

            int start = i;  // starting index

            // Middle loop: fixes the ending index of subarray
            for (int j = i; j < number.length; j++) {

                int end = j; // ending index

                // Inner loop: prints elements from start to end
                for (int k = start; k <= end; k++) {

                    // print current subarray element
                    System.out.print(number[k] + " ");
                }

                // new line after printing one subarray
                System.out.println();
            }

            // blank line after all subarrays starting with index i
            System.out.println();
        }
    }

    public static void main(String args[]) {

        // Given array
        int number[] = {2, 4, 6, 8, 10};

        // Call function to print all subarrays
        printSubarrays(number);
    }
}
