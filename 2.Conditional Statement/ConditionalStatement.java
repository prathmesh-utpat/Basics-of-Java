import java.util.*;

public class ConditionalStatement {

    public static void main(String args[]) {

        // ================================
        // 1️⃣ IF–ELSE STATEMENT
        // ================================

        int age = 22;

        // Check whether age is 18 or above
        // If condition is true → if block executes
        // Otherwise → else block executes
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

        // ================================
        // 2️⃣ EVEN OR ODD CHECK
        // ================================

        int x = 10;

        // Modulus operator (%) gives remainder
        // If remainder is 0 → number is even
        // Otherwise → number is odd
        if (x % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        // ================================
        // 3️⃣ ELSE-IF LADDER
        // ================================

        int marks = 85;

        // Conditions are checked from top to bottom
        // First true condition executes and rest are skipped
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        // ================================
        // 4️⃣ TERNARY OPERATOR
        // ================================

        int score = 35;

        // Ternary operator is a shortcut for if-else
        // Syntax: condition ? value_if_true : value_if_false
        String result = (score >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        // ================================
        // 5️⃣ SWITCH-CASE STATEMENT
        // ================================

        int day = 3;

        // Switch checks value of 'day'
        // Matching case executes
        // break stops execution and exits switch
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
                // Executes when no case matches
                System.out.println("Invalid Day");
        }

        /*
         Time Complexity:
         O(1)
         Reason: All conditions take constant time

         Space Complexity:
         O(1)
         Reason: No extra memory used
        */
    }
}
