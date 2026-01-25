public class FunctioPracticeQuestion { public class AllQuestionsUsingFunctions {

    // -------------------------------------------------
    // Question 1:
    // Compute average of three numbers
    // Logic: (a + b + c) / 3
    // -------------------------------------------------
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // -------------------------------------------------
    // Question 2:
    // Check whether a number is even
    // Logic: Even if divisible by 2
    // -------------------------------------------------
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // -------------------------------------------------
    // Question 3:
    // Check whether a number is palindrome
    // Logic:
    // Reverse the number and compare with original
    // -------------------------------------------------
    public static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }

        return original == reverse;
    }

    // -------------------------------------------------
    // Question 4:
    // Demonstrate Math class methods using a function
    // -------------------------------------------------
    public static void mathOperations() {

        System.out.println("Math.min(10, 20) = " + Math.min(10, 20));
        System.out.println("Math.max(10, 20) = " + Math.max(10, 20));
        System.out.println("Math.sqrt(25) = " + Math.sqrt(25));
        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3));
        System.out.println("Math.abs(-15) = " + Math.abs(-15));

        // NOTE: Math.avg() does NOT exist in Java
    }

    // -------------------------------------------------
    // Question 5:
    // Compute sum of digits of a number
    // Logic:
    // Get last digit → add to sum → remove digit
    // -------------------------------------------------
    public static int sumOfDigits(int n) {

        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }

        return sum;
    }

    // -------------------------------------------------
    // MAIN METHOD (Only function calls)
    // -------------------------------------------------
    public static void main(String[] args) {

        // Question 1
        System.out.println("Average of 10, 20, 30 = " + average(10, 20, 30));

        // Question 2
        System.out.println("Is 10 even? " + isEven(10));
        System.out.println("Is 7 even? " + isEven(7));

        // Question 3
        System.out.println("Is 121 palindrome? " + isPalindrome(121));
        System.out.println("Is 321 palindrome? " + isPalindrome(321));

        // Question 4
        mathOperations();

        // Question 5
        System.out.println("Sum of digits of 123 = " + sumOfDigits(123));
    }
}

    
}
