public class Polymorphism {

    public static void main(String args[]) {

        // =========================================
        // 1️⃣ Compile-Time Polymorphism (Overloading)
        // =========================================

        Calculator cal = new Calculator();

        // Method selection decided at compile time
        System.out.println(cal.sum(1, 2));          // int version
        System.out.println(cal.sum(1.5f, 2.5f));    // float version
        System.out.println(cal.sum(1, 2, 3));       // three int version


        System.out.println();

        // =========================================
        // 2️⃣ Runtime Polymorphism (Overriding)
        // =========================================

        // Parent reference → Child object
        Animal a = new Dog();

        // Method call decided at runtime
        // JVM checks actual object (Dog)
        a.sound();

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        All method calls: O(1)
        Object creation: O(1)
        Space Complexity: O(1)
        */
    }
}

// =========================================
// Compile-Time Polymorphism Class
// =========================================
class Calculator {

    // Method 1
    int sum(int a, int b) {
        return a + b;
    }

    // Method 2 (different parameter type)
    float sum(float a, float b) {
        return a + b;
    }

    // Method 3 (different number of parameters)
    int sum(int a, int b, int c) {
        return a + b + c;
    }
}


// =========================================
// Runtime Polymorphism Classes
// =========================================

// Parent class
class Animal {

    // Method that will be overridden
    void sound() {
        System.out.println("Animal makes sound");
    }
}

// Child class
class Dog extends Animal {

    // Overriding parent method
    void sound() {
        System.out.println("Dog barks");
    }
}
