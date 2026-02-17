// ===========================================
// ABSTRACTION USING ABSTRACT CLASS
// ===========================================

// Abstract class
abstract class Animal {

    // Abstract method (no body)
    // Child class must implement this
    abstract void sound();

    // Normal method (has implementation)
    void eat() {
        System.out.println("Animal eats");
    }
}

/*
Rules of Abstract Class:
1️⃣ Use 'abstract' keyword before class name
2️⃣ Abstract methods must not have body
3️⃣ If a class contains abstract method, class must be abstract
4️⃣ Cannot create object of abstract class
5️⃣ Can contain normal methods
*/


// Child class extending abstract class
class Dog extends Animal {

    // Must implement abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}


// Main class
public class AbstractionType1AbstractClass {

    public static void main(String args[]) {

        // Creating object of child class
        Dog d1 = new Dog();

        // Calling implemented method
        d1.sound();   // Dog barks

        // Calling inherited normal method
        d1.eat();     // Animal eats

        /*
        ❌ Not Allowed:
        Animal a = new Animal();
        Because abstract class cannot create object.

        =====================================
        TIME & SPACE COMPLEXITY
        =====================================
        Method calls: O(1)
        Object creation: O(1)
        Space Complexity: O(1)
        */
    }
}
