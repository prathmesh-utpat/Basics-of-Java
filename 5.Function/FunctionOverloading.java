public class FunctionOverloading {

    public static int sum(int a , int b) {
        return a+b;
    }

    public static int sum(int a , int b , int c) {
        return a+b+c;
    }
    // same function name with different parameters is called function overloading - sum function name and Int a ,b is parameters

    // now function for different data types
    public static float sum(float a , float b) {
        return a+b;
    }


    public static void main(String args[]) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
        System.out.println(sum(2.5f,3.5f));
    }
}

