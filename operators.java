import java.util.*;

public class Operators {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER :");
        int a = sc.nextInt();

        System.out.println("ENTER SECOND NUMBER :");
        int b = sc.nextInt();

        // ---------------- Arithmetic Operators ----------------
        int sum = a + b;
        int diff = a - b;
        int multiply = a * b;
        int divide = a / b;
        int mod = a % b;

        System.out.println("\n--- ARITHMETIC OPERATORS ---");
        System.out.println("SUM = " + sum);
        System.out.println("DIFFERENCE = " + diff);
        System.out.println("PRODUCT = " + multiply);
        System.out.println("DIVISION = " + divide);
        System.out.println("MODULUS = " + mod);


        // ---------------- Relational Operators ----------------
        System.out.println("\n--- RELATIONAL OPERATORS ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));


        // ---------------- Logical Operators ----------------
        boolean cond1 = (a > 0);
        boolean cond2 = (b > 0);

        System.out.println("\n--- LOGICAL OPERATORS ---");
        System.out.println("cond1 && cond2 : " + (cond1 && cond2)); // both true?
        System.out.println("cond1 || cond2 : " + (cond1 || cond2)); // any one true?
        System.out.println("!cond1 : " + (!cond1)); // reverse


        // ---------------- Assignment Operators ----------------
        int x = a;  // assign value of a

        System.out.println("\n--- ASSIGNMENT OPERATORS ---");
        System.out.println("x = " + x);

        x += 5; // x = x + 5
        System.out.println("x += 5 --> " + x);

        x -= 3; // x = x - 3
        System.out.println("x -= 3 --> " + x);

        x *= 2; // x = x * 2
        System.out.println("x *= 2 --> " + x);

        x /= 2; // x = x / 2
        System.out.println("x /= 2 --> " + x);
    }
}
