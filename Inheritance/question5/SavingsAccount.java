package OOPS.Inheritance.question5;

public class SavingsAccount extends BankAccount{
    public SavingsAccount( String accountNum, double balance) {
        super(accountNum, balance);
    }



    @Override
    public void withdraw(double amount) {
        if(getBalance()-amount<100){
            System.out.println("Minimum 100rs required.\nlow balance you cant withdraw.");
            return;
        }
        else{
            super.withdraw(amount);
        }
    }
}
