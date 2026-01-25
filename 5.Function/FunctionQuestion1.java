public class FunctionQuestion1 {

    // Function to find product of two numbers
    public static int multiply(int a, int b) {
        return a * b;   // direct return (optimized)
    }

    // Function to find factorial of a number
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;    // shorthand multiplication
        }
        return f;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 3;

        // Product
        int prod = multiply(a, b);
        System.out.println("The product is: " + prod);

        // Factorial
        int fact = factorial(4);
        System.out.println("The factorial is: " + fact);
    }
}
