package Excersises;

public class CreditLimitCalculator {
    private int accountNumber;
    private int balance;
    private int totalItemCharge;
    private int totalCredit;
    private int creditLimit;

    public CreditLimitCalculator(){}

    public CreditLimitCalculator(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public CreditLimitCalculator(int accountNumber, int balance, int totalItemCharge, int totalCredit, int creditLimit){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.totalItemCharge = totalItemCharge;
        this.totalCredit = totalCredit;
        this.creditLimit = creditLimit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalItemCharge() {
        return totalItemCharge;
    }

    public void setTotalItemCharge(int totalItemCharge) {
        this.totalItemCharge = totalItemCharge;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
}
