public class PatternQuestion {

    public static void main(String[] args) {

        // Pattern 1: Normal Star Pattern
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 2: Inverted Star Pattern
        for (int line = 4; line >= 1; line--) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 3: Number Pattern
        int n = 4;
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <= line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }

        // Pattern 4: Alphabet Pattern
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int alpha = 1; alpha <= line; alpha++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
