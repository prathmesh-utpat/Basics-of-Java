public class ObjectClass {

    public static void main(String args[]) {

        // ===============================
        // Object Creation
        // ===============================

        Student s1 = new Student();

        // ===============================
        // Assign values to object
        // ===============================

        s1.name = "Prathmesh";
        s1.age = 22;

        // Call method to calculate percentage
        s1.calPercentage(90, 85, 80);

        // ===============================
        // Print values
        // ===============================

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Percentage: " + s1.percentage);

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        Object creation: O(1)
        Method call: O(1)

        Space Complexity: O(1)
        One object stored in heap memory.
        */
    }
}

class Student {

    // ===============================
    // Instance Variables (Properties)
    // ===============================

    String name;
    int age;
    float percentage;

    // ===============================
    // Method (Behavior)
    // ===============================

    void calPercentage(int phy, int chem, int math) {

        // Use float division
        percentage = (phy + chem + math) / 3.0f;
    }
}
