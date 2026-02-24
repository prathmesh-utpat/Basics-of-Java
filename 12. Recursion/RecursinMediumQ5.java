public class RecursinMediumQ5 {

    //print ith fibonacci number 

    public static int Fib(int n ){
        //base case 
        if(n == 0 || n == 1){
            return n ;  
        }
        //recursive case 
        int f1 = Fib(n-1);
        int f2 = Fib(n-2);
        int fn = f1 + f2;
        return fn;
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(Fib(n));
    }
    
}
