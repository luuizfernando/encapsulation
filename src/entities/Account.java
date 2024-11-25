package entities;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void increaseBalance(double value) {
        this.balance += value;
    }

    public void decreaseBalance(double value) {
        this.balance -= value + 5;
    }

    public String toString() {
        return "Account " +
                accountNumber +
                ", Holder: " +
                accountHolder +
                ", Balance: $ " +
                String.format("%.2f", balance);
    }
}