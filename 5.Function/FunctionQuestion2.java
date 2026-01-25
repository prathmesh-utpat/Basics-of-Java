public class FunctionQuestion2 {

    // Q Find Binomial Coefficient
    //First write a function to calculate factorial of a number
    
    public static int factorial(int n)  {
        int f = 1;
        for (int i=1; i<=n; i++ ) {
            f=f*i;  
        }
        return f;
    } 

        // now write a function to calculate binomial coefficient nCr
        public static int binomialCoefficient(int n,int r) {
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_n_r = factorial(n - r);

            int nCr = fact_n / (fact_r * fact_n_r);
            return nCr;
        }

        public static void main(String args[]) {
            int n = 25; 
            int r = 10;
            System.out.println(binomialCoefficient(n,r));

    
    }
}
    