public class Q4Substring {

    // =====================================
    // FUNCTION TO CREATE SUBSTRING MANUALLY
    // =====================================
    public static String substring(String str, int startIndex, int endIndex) {

        // StringBuilder is efficient for building strings
        StringBuilder result = new StringBuilder();

        for (int i = startIndex; i < endIndex; i++) {

            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String args[]) {

        String str = "hello world";

        System.out.println(substring(str, 0, 5));


        // OR JAVA SUBSTRING INBUILT FUNCTION - .Substring(Strating index , ending index)
        System.out.println("inbuilt .Substring Function");
        String str2 = "hello world";
        System.out.println(str2.substring(0, 5));


        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Time Complexity: O(n)

        Where n = endIndex - startIndex.

        -------------------------------------

        Space Complexity: O(n)

        Because a new string of length n is created.
        */
    }
}
