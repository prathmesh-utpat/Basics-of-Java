import java.util.*;

public class Operator1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER FIRST NUMBER :");
        int a = sc.nextInt();

        System.out.println("ENTER SECOND NUMBER :");
        int b = sc.nextInt();

        // ---------------- Arithmetic Operators ----------------
        System.out.println("\n--- ARITHMETIC OPERATORS ---");

        int sum = a + b;
        int diff = a - b;
        int multiply = a * b;

        System.out.println("SUM = " + sum);
        System.out.println("DIFFERENCE = " + diff);
        System.out.println("PRODUCT = " + multiply);

        if (b != 0) {
            System.out.println("DIVISION = " + (a / b));
            System.out.println("MODULUS = " + (a % b));
        } else {
            System.out.println("DIVISION = Not allowed (division by zero)");
            System.out.println("MODULUS = Not allowed (division by zero)");
        }

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
        System.out.println("cond1 && cond2 : " + (cond1 && cond2));
        System.out.println("cond1 || cond2 : " + (cond1 || cond2));
        System.out.println("!cond1 : " + (!cond1));

        // ---------------- Assignment Operators ----------------
        int x = a;

        System.out.println("\n--- ASSIGNMENT OPERATORS ---");
        System.out.println("x = " + x);

        x += 5;
        System.out.println("x += 5 --> " + x);

        x -= 3;
        System.out.println("x -= 3 --> " + x);

        x *= 2;
        System.out.println("x *= 2 --> " + x);

        if (x != 0) {
            x /= 2;
            System.out.println("x /= 2 --> " + x);
        } else {
            System.out.println("x /= 2 --> Cannot divide zero by 2");
        }

        sc.close();
    }
}
