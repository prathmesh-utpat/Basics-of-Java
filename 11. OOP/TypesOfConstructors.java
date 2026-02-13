class Student {

    String name;
    int age;

    // =====================================
    // 1️⃣ Non-Parameterized Constructor
    // =====================================
    Student() {
        name = "Unknown";
        age = 0;
    }

    // =====================================
    // 2️⃣ Parameterized Constructor
    // =====================================
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // =====================================
    // 3️⃣ Copy Constructor
    // =====================================
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class TypesOfConstructors {

    public static void main(String args[]) {

        // 1️⃣ Non-Parameterized
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // 2️⃣ Parameterized
        Student s2 = new Student("Prathmesh", 22);
        s2.display();

        System.out.println();

        // 3️⃣ Copy Constructor
        Student s3 = new Student(s2);
        s3.display();

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        All constructor calls: O(1)
        Copy constructor: O(1)

        Space Complexity: O(1)
        Each object stored separately in heap memory.
        */
    }
}
