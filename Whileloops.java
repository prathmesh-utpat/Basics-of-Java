import java.util.Scanner;   // Import Scanner class for user input

public class Whileloops {

    public static void main(String[] args) {

        // -------------------------------
        // 1. While loop example
        // Prints a message 100 times
        // -------------------------------
        int a = 0;
        while (a < 100) {
            System.out.println("Hello");
            a++;
        }

        // -------------------------------
        // 2. Print numbers from 1 to n
        // (n is taken from user input)
        // -------------------------------
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int b = sc.nextInt();   // User input

        int counter = 1;
        while (counter <= b) {
            System.out.println(counter);
            counter++;
        }

        // -------------------------------
        // 3. Sum of first n numbers
        // Example: n = 5 → sum = 1+2+3+4+5
        // -------------------------------
        int i = 1;
        int n = 5;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum of first " + n + " numbers is: " + sum);

        sc.close(); // Close the scanner
    }
}
