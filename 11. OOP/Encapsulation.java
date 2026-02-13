// Encapsulation example

class BankAccount {

    // ==============================
    // Private Data (Hidden)
    // ==============================
    private double balance;

    // ==============================
    // Public Method to Modify Data
    // ==============================
    public void deposit(double amount) {

        // Validation before updating
        if (amount > 0) {
            balance += amount;
        }
    }

    // ==============================
    // Public Method to Access Data
    // ==============================
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {

    public static void main(String args[]) {

        // Create object
        BankAccount acc = new BankAccount();

        // Deposit money
        acc.deposit(1000);

        // Access balance using getter
        System.out.println("Balance: " + acc.getBalance());

        /*
        =====================================
        TIME & SPACE COMPLEXITY
        =====================================

        deposit(): O(1)
        getBalance(): O(1)

        Space Complexity: O(1)
        One object stored in heap memory.
        */
    }
}
