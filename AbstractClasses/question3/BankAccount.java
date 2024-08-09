package OOPS.AbstractClasses.question3;
// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
// Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement
// the respective methods to handle deposits and withdrawals for each account type
public abstract class BankAccount {
    private double accountNum;
    private double balance;

    public BankAccount(double accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAccountNum() {
        return accountNum;
    }

    abstract void deposite(double amount);
    abstract void withdraw(double amount);


}
