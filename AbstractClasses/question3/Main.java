package OOPS.AbstractClasses.question3;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(123423,5000);
        System.out.println("Deposite money in saving account");
        savingAccount.deposite(600);
        System.out.println("Withdrawing money from saving account");
        savingAccount.withdraw(6000);

        CurrentAccount currentAccount = new CurrentAccount(533442,1003423);
        System.out.println("\nDeposite money in Current account");
        currentAccount.deposite(600);
        System.out.println("Withdrawing money from Current account");
        currentAccount.withdraw(60000);

    }
}
