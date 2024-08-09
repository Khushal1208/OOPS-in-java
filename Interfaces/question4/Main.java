package OOPS.Interfaces.question4;

import OOPS.second.a.A;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingAccount savingAccount = new SavingAccount("khushal","khu231",123133,1.23);
        CurrentAccount currentAccount = new CurrentAccount("yashpal","yash2132",455343,2.3);

        bank.addAccount(savingAccount);
        bank.addAccount(currentAccount);
        bank.printAccountBalances();

    }
}
