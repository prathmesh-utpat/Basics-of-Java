public class ArrayBinarySearch {

    public static int binary(int number[], int key  ){
        int start = 0 ; 
        int end = number.length-1;

        //1.calculate mid
        while ( start <= end ) {
            int mid = (start+end)/2;

            // compare 
            if ( number[mid]==key) {
                return mid; 
            }
            if (number[mid] < key){ // right
                start = mid+1;
            }
            else { //left
                start = mid-1;
            }
        }
        return -1;
    

    }

    public static void main(String args[] ){
        int number[] = {10,20,30,40,50,60,70,80,90};
        int key = 90;
         
        System.out.println( "index for key is ; " +binary(  number , key));



    }
    
}
