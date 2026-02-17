// ==========================================
// Interface 1
// ==========================================
interface Animal {

    // Abstract method (public and abstract by default)
    void sound();
}


// ==========================================
// Class implementing Animal interface
// ==========================================
class Dog implements Animal {

    // Must use public while implementing interface method
    public void sound() {
        System.out.println("Dog barks");
    }
}


// ==========================================
// Multiple Inheritance Using Interfaces
// ==========================================

// First Interface
interface Camera {

    void click();
}

// Second Interface
interface MusicPlayer {

    void play();
}


// Class implementing multiple interfaces
class Smartphone implements Camera, MusicPlayer {

    // Implement Camera method
    public void click() {
        System.out.println("Photo clicked");
    }

    // Implement MusicPlayer method
    public void play() {
        System.out.println("Music playing");
    }
}


// ==========================================
// Main Class
// ==========================================
public class AbstractionType2Interfaces {

    public static void main(String[] args) {

        // ----------------------------------
        // Example 1: Single Interface
        // ----------------------------------

        Animal a = new Dog();  // Interface reference → Child object
        a.sound();

        System.out.println();

        // ----------------------------------
        // Example 2: Multiple Interfaces
        // ----------------------------------

        Smartphone s1 = new Smartphone();

        s1.click();
        s1.play();

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
