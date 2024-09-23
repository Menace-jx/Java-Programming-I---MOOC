
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        Account menaceAccount = new Account("Menace's account", 100.0);

        System.out.println(menaceAccount);

        menaceAccount.deposit(20.0);

        System.out.println(menaceAccount);
    }
}
