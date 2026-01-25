import java.util.Scanner;

public class Function{

    // Basic function to print hello
    public static void sayHello() {
        System.out.println("Hello");
    }

    // Function to calculate and print sum of two numbers
    public static void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {

        // Calling sayHello function
        sayHello();

        // Taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calling calculateSum function
        calculateSum(a, b);

        // Closing scanner
        sc.close();
    }
}
