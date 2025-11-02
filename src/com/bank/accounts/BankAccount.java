package com.bank.accounts;
import com.bank.enums.AccountType;
import com.bank.transactions.Transaction;
import com.bank.transactions.TransactionHistory;
import java.util.List;

public abstract class BankAccount {

    private double balance;
    private AccountType accountType;
    private boolean accountStatus = true;
    private String accountNumber;

    public void setTransactionHistory(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    private TransactionHistory transactionHistory = null;


    public BankAccount(double initialBalance, AccountType initialAccountType){
        this.balance = initialBalance;
        this.accountType = initialAccountType;
        transactionHistory = new TransactionHistory();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean getAccountStaus() {
        return accountStatus;
    }

    public synchronized void diposit(double amount) {
        if(amount > 0){
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposit " + amount + " to " + this.accountNumber + " New Balance : " + balance);
        }

    }

    public synchronized void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdraw " + amount + " from " + this.accountNumber + " New Balance : " + balance);
        }else{
            System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount + " from " + this.accountNumber + " Insufficient funds ");
        }

    }

    public  TransactionHistory getTransactionHistory(){
        return transactionHistory;
    }

    // متد انتزاعی برای محاسبه سود
    public abstract double calculateInterest();

    protected abstract String accountNoGenerator();

    public void printAccountInfo(){
        System.out.println("Account Type : "+ accountType);
        System.out.println("Balance : " + balance);
        System.out.println("Status : " + (accountStatus? "Active" : "Closed"));
        System.out.println(transactionHistory.getTransactions());
    }



}

