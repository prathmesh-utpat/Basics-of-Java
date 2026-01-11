public class FunctionQuestion4 {

    //Q- Function to check whether a number is prime or not
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false; // divisible → not prime
            }
        }

        return true; // no divisor found → prime
    }

    public static void main(String[] args) {

        // Check single numbers
        System.out.println(isPrime(23)); // true
        System.out.println(isPrime(24)); // false






        //Q- Print prime numbers from 1 to 200
        // Prime or not is already implemented in isPrime function
        System.out.println("Prime numbers between 1 and 200 are:");

        for (int i = 2; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
