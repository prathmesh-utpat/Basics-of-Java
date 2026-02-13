
class Student {

    private int marks;  // hidden data

    // Setter → sets value
    public void setMarks(int m) {
        marks = m;
    }

    // Getter → returns value
    public int getMarks() {
        return marks;
    }
}

public class GettersAndSetters {

    public static void main(String args[]) {

        Student s1 = new Student();

        s1.setMarks(90);  // set value

        System.out.println(s1.getMarks());  // get value
    }
}
