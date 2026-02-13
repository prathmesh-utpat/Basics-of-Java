public class AccessModifiers {

    public static void main(String args[]) {

        BankAccount myAccount = new BankAccount();

        myAccount.username = "Prathmesh";

        // myAccount.password = "pppp"; ❌ Not allowed

        myAccount.setPassword("pppp");
    }
}

class BankAccount {

    public String username;
    private String password;

    // Setter method
    public void setPassword(String pwd) {
        password = pwd;
    }
}
