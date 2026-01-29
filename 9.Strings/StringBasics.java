import java.util.*;

public class StringBasics {

    public static void main(String args[]) {

        // =====================================
        // CREATE A STRING
        // =====================================
        // String literal creation
        String a = "abcd";
        System.out.println(a);

        // =====================================
        // FIND LENGTH OF STRING
        // =====================================
        String b = "pppppp";
        System.out.println(b.length());

        // =====================================
        // TAKE INPUT IN STRING
        // =====================================
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Enter the full name:");

        // nextLine() takes the complete line
        // next() only takes a single word
        name = sc.nextLine();

        System.out.println(name);

        // =====================================
        // CONCATENATION
        // =====================================
        String firstName = "Prathmesh";
        String lastName = "Utpat";

        // Joining two strings
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // =====================================
        // ACCESS CHARACTER AT INDEX
        // =====================================
        String nameSearch = "Prathmesh";

        // charAt(index) returns character at that position
        System.out.println(nameSearch.charAt(0));

        sc.close();

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        String creation & access:
        Time Complexity: O(1)

        length() and charAt():
        Time Complexity: O(1)

        Concatenation using + (small strings):
        Time Complexity: O(n)

        Space Complexity: O(n)
        Because new string objects are created in memory.
        */
    }
}
