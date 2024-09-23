
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthewsAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);

        //Withdraw on Matthews account
        matthewsAccount.withdrawal(100.0);
        //deposit on my account
        myAccount.deposit(100.0);

        //prints both account
        System.out.println(matthewsAccount);
        System.out.println(myAccount);
    }
}
