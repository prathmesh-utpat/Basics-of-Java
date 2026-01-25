public class ArrayLinearSearch {

   public static int linearsearch(int[] arr, int key) {

        for (int i=0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
            return -1; //key not found
    }
    




    
    public static void main(String args[]) {
        int arr[] = {10,20,30,40,50};

        // key - required element to be searched in arr 
        int key = 50;
        int result = linearsearch(arr , key);
        if (result !=-1) {
            System.out.println("Result Found at index : " + result);
        }
        else {System.out.println("not Found");

        }

    }
}
