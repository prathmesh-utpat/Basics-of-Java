public class QBInaryToDecimal {

    // Function to convert Binary to Decimal
    public static int binaryToDecimal(int binary) {

        int decimal = 0;   // stores final decimal value
        int power = 0;     // represents power of 2 (2^0, 2^1, ...)

        while (binary > 0) {

            int lastDigit = binary % 10;  // get last digit of binary number

            // If digit is not 0 or 1, it is NOT a valid binary number
            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid Binary Number");
                break;   // exit the loop immediately
            }

            // Binary to Decimal formula:
            // decimal = digit × 2^position
            decimal = decimal + (lastDigit * (int) Math.pow(2, power));

            power++;          // move to next power of 2
            binary = binary / 10; // remove last digit
        }

        return decimal; // return final decimal value
    }

    public static void main(String[] args) {

        int n = 1011; // binary number

        // Function call
        int result = binaryToDecimal(n);

        System.out.println("Decimal value is: " + result);
    }
}
