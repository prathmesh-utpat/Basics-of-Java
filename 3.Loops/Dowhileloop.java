import java.util.Scanner;

public class Dowhileloop {

    public static void main(String[] args) {

        // --------------------------------
        // 1. Do-While loop example
        // Executes at least once
        // --------------------------------
        int i = 1;
        do {
            System.out.println("h");
            i++;
        } while (i <= 5);

        // --------------------------------
        // 2. break keyword example
        // Loop stops completely when b == 3
        // --------------------------------
        for (int b = 1; b <= 5; b++) {
            if (b == 3) {
                break; // exits the loop when b becomes 3
            }
            System.out.println(b);
        }
        System.out.println("break statement executed");

        // --------------------------------
        // 3. continue keyword example
        // Skips only the current iteration
        // --------------------------------
        for (int c = 1; c <= 5; c++) {
            if (c == 3) {
                continue; // skips printing when c == 3
            }
            System.out.println(c);
        }
        System.out.println("continue statement executed");

        // --------------------------------
        // 4. Check whether a number is PRIME or NOT
        // --------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check prime: ");
        int n = sc.nextInt();

        // Prime numbers are greater than 1
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            // Check divisibility from 2 to n-1
            for (int d = 2; d <= n - 1; d++) {

                // If n is divisible by any number,
                // then it is NOT prime
                if (n % d == 0) {
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }

        // Final result
        if (isPrime) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is NOT a Prime number");
        }

        sc.close();
    }
}
