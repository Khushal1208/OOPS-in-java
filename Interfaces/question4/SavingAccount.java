package OOPS.Interfaces.question4;

public class SavingAccount implements Account {
    private  String name,accNum;
    private double balance,interestRate;

    public SavingAccount(String name, String accNum, double balance, double interestRate) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposite(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public double calculateInterest() {
        return (balance = balance + ((balance * interestRate) / 100));
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
