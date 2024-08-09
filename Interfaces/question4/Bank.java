package OOPS.Interfaces.question4;

import java.util.ArrayList;

//Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and
// CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should  be
// an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount
// and CurrentAccount should implement the Account interface and have their own unique methods.
public class Bank {
    private ArrayList<Account> accounts ;

    public Bank() {
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account){
        accounts.remove(account);
    }
    public void deposite(Account account,double amount){
        account.deposite(amount);
    }
    public  void withdraw(Account account,double amount){
        account.withdraw(amount);
    }
    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }

}
