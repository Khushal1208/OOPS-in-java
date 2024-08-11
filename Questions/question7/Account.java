package OOPS.Questions.question7;

public class Account{
    private  String name , accNum;
    private double balance;

    public Account(String name, String accNum, double balance) {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposite(double amount ){
        balance += amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public void PrintAccountDetails(){
        System.out.println("Name: "+name+" , Account Number: "+accNum+" , Balance: "+balance);
    }

}