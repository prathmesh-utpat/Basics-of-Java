public class PatternAdvanceQ3 {
    // Question 3: Print floyd's triangle
    
    public static void floyds_triangle(int n) {
        //outer loop - for rows
        int counter=1;
        for (int i=1; i<=n; i++ ) {
            //inner loop - for columns
            for ( int j=1; j<=i; j++ ) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println(); // new line after each row
        }
    }

    public static void main(String args[]){
        floyds_triangle(5);
    }
}
