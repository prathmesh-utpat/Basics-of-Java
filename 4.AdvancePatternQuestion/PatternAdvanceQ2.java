public class PatternAdvanceQ2 

// Question 2: Print half pyramid pattern using stars [right aligned]

{public static void hal(int n) {
    for (int i = 1; i <= n; i++) {
        for (int s = 1; s <= n - i; s++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    hal(4);
}

    
}
