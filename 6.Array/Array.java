import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int marks[] = new int[50];
        int number[] = {12, 23, 34};
        String name[] = {"pppp", "rrr", "ttt"};

        marks[0] = 80;
        marks[1] = 70;
        marks[2] = 60;

        System.out.println("che : " + marks[0]);
        System.out.println("phy : " + marks[1]);
        System.out.println("math : " + marks[2]);

        marks[2] = 100;
        System.out.println("updated math : " + marks[2]);

        //to print arrya - best way 
        for (int i = 0; i < number.length; i++) {
    System.out.print(number[i] + " ");
}

System.out.println();

for (int i = 0; i < name.length; i++) {
    System.out.print(name[i] + " ");
}
System.out.println();
 
// or - use Array.toString() function

        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(name));
    }
}
