package OOPS.Questions.question7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("Peter Irmgard", "C0011", 5000.0);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500.0);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccountCollection();
        for(Account account: accounts){
            account.PrintAccountDetails();
        }
        System.out.println();
        bank.depositeMoney(account1,24342);
        account1.PrintAccountDetails();
        bank.withdrawMoney(account3,5000);
        account3.PrintAccountDetails();
        System.out.println("total number of accounts are : "+accounts.size());
        accounts.remove(account2);
        System.out.println("account2 is removed");
        System.out.println("total number of accounts are : "+accounts.size());




    }
}
