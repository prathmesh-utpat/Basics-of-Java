import java.util.*;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // creating scanner object to take input

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // reading string input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // reading integer input

        System.out.println("Your name is " + name + " and your age is " + age);
        // printing name and age

        //calculator example

        System.out.print("Enter First Number: ");
        int a=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum is: " + sum);

        sc.close(); // close scanner to avoid resource leak
    }
}

