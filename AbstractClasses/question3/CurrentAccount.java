package OOPS.AbstractClasses.question3;

public class CurrentAccount extends BankAccount{
    public CurrentAccount(double accountNum, double balance) {
        super(accountNum, balance);
    }

    @Override
    void deposite(double amount) {
        setBalance(getBalance()+amount);
        System.out.println("Deposited amount of "+amount+" Current balance is "+getBalance()+"🤑💰🪙💹");
    }

    @Override
    void withdraw(double amount) {
        if(getBalance()<amount){
            System.out.println("Insufficient balance😢😭.Can't withdraw amount "+amount);
        }
        else {
            setBalance(getBalance()-amount);
            System.out.println("Withdrawal amount is "+amount+" is Successfull👍😊. Current balance is "+getBalance());
        }
    }
}
