package OOPS.Questions.question7;

import java.util.ArrayList;

// Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts,
// and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer

public class Bank {
  private  ArrayList<Account> accountCollection ;
  public Bank(){
      accountCollection = new ArrayList<Account>();
  }
  public void addAccount(Account account){
      accountCollection.add(account);
  }
    public void removeAccount(Account account){
        accountCollection.remove(account);
    }

    public void depositeMoney(Account account, double amount){
        account.deposite(amount);
    }
    public void withdrawMoney(Account account, double amount){
        account.withdraw(amount);
    }

    public ArrayList<Account> getAccountCollection() {
        return accountCollection;
    }
}