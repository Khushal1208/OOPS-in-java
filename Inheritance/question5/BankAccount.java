package OOPS.Inheritance.question5;
//Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw().
//Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals
//if the account balance falls below one hundred
public class BankAccount {
    private String accountNum;
    private double balance;

    public BankAccount( String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }
    public void deposite(double amount){
        balance +=amount;
    }
    public void withdraw(double amount){
        if(getBalance() < amount){
            System.out.println("Insufficient Balance.");
        }
        balance -=amount;
    }

    public double getBalance() {
        return balance;
    }
}
