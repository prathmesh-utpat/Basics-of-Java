// Q- pritn nth term of fibonacci series

public class RecursionMediumQ5 {
    
    public static int calFib(int n) 
    {
        // Base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive case
        int fib1 = calFib(n - 1);
        int fib2 = calFib(n - 2);
        int fn = fib1 + fib2;

        return fn;

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Time Complexity: O(2^n)
        Each call generates two more calls.

        Space Complexity: O(n)
        Because recursion stack depth = n.
        */
    }
    public static void main(String args[]) {

        int result = calFib(5);
        System.out.println("Fibonacci term = " + result);
    }
}
