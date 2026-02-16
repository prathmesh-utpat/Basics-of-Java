// =============================================
// 1️⃣ SINGLE INHERITANCE
// =============================================

// Parent class
class Animal {

    // Method of parent class
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting Animal
class Dog extends Animal {

    // Method of child class
    void bark() {
        System.out.println("Dog is barking");
    }
}


// =============================================
// 2️⃣ MULTILEVEL INHERITANCE
// =============================================

// Grandparent class
class LivingBeing {

    void breathe() {
        System.out.println("Living being breathes");
    }
}

// Parent class inheriting LivingBeing
class Mammal extends LivingBeing {

    void walk() {
        System.out.println("Mammal walks");
    }
}

// Child class inheriting Mammal
class Human extends Mammal {

    void speak() {
        System.out.println("Human speaks");
    }
}


// =============================================
// 3️⃣ HIERARCHICAL INHERITANCE
// =============================================

// One parent class
class Vehicle {

    void start() {
        System.out.println("Vehicle starts");
    }
}

// Multiple child classes inheriting same parent
class Car extends Vehicle {

    void drive() {
        System.out.println("Car drives");
    }
}

class Bike extends Vehicle {

    void ride() {
        System.out.println("Bike rides");
    }
}


// =============================================
// 4️⃣ MULTIPLE INHERITANCE (Using Interface)
// =============================================

// First interface
interface Camera {

    void click();
}

// Second interface
interface MusicPlayer {

    void playMusic();
}

// Class implementing multiple interfaces
class Smartphone implements Camera, MusicPlayer {

    // Implementing Camera method
    public void click() {
        System.out.println("Photo clicked");
    }

    // Implementing MusicPlayer method
    public void playMusic() {
        System.out.println("Music playing");
    }
}


// =============================================
// MAIN CLASS
// =============================================
public class TypesOfInheritance {

    public static void main(String args[]) {

        // -----------------------------
        // Single Inheritance
        // -----------------------------
        Dog d1 = new Dog();
        d1.eat();   // inherited from Animal
        d1.bark();  // own method

        System.out.println();

        // -----------------------------
        // Multilevel Inheritance
        // -----------------------------
        Human h1 = new Human();
        h1.breathe(); // from LivingBeing
        h1.walk();    // from Mammal
        h1.speak();   // own method

        System.out.println();

        // -----------------------------
        // Hierarchical Inheritance
        // -----------------------------
        Car c1 = new Car();
        c1.start();  // from Vehicle
        c1.drive();  // own method

        Bike b1 = new Bike();
        b1.start();  // from Vehicle
        b1.ride();   // own method

        System.out.println();

        // -----------------------------
        // Multiple Inheritance (Interface)
        // -----------------------------
        Smartphone s1 = new Smartphone();
        s1.click();
        s1.playMusic();

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        All method calls: O(1)
        Object creation: O(1)

        Space Complexity: O(1)
        Each object stored separately in heap memory.
        */
    }
}
