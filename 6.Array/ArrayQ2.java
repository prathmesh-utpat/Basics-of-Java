public class ArrayQ2 {

    //Lecture 9 - Printe reverse array - 

    public static void reverse(int arr []) {

        // Swap the last digit to first digit - replace last digit to fitst in loop 
        int first = 0;
        int last = arr.length-1;

        while ( first < last ) {
            //swap - first create enpty temperary variable for store last index digit 
            int temp = arr[last];
            //now last indes is empty - assign first index digit in last 
            arr[last] = arr[first]; 
            // now first indes is empty assign - temp - means last indes digit 
            arr[first] = temp;

            first++;
            last--;
        }
        }  
    

    public static void main(String args[]) {
        int arr[] = {10,20,30,40,};
    reverse (arr );
         for (int i=0; i<arr.length; i++ ) {
            System.out.println(arr[i] + "");
         }
         System.out.println();
    }
}
    

