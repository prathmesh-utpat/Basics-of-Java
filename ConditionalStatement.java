import java.util.*;

public class ConditionalStatement {

    public static void main(String args[]) {

        // if-else example
        int age = 22;

        // check the age - 18+
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        // Q - print if a number is even or odd
        int x = 10;

        if (x % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // else-if example
        int marks = 85;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        // ternary operator example
        int score = 35;
        String result = (score >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        // switch-case example
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
