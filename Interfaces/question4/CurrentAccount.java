package OOPS.Interfaces.question4;

public class CurrentAccount implements Account {
    private  String name,accNum;
    private double balance,overdraftLimit;

    public CurrentAccount(String name, String accNum, double balance, double overdraftLimit) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public String getName() {
        return name;
    }

    public String getAccNum() {
        return accNum;
    }

    @Override
    public void deposite(double amount) {
         balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }
    }

    @Override
    public double calculateInterest() {
        return (balance = balance + ((balance * overdraftLimit) / 100));
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
