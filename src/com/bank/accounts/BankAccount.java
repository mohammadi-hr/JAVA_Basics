package com.bank.accounts;
import com.bank.enums.AccountType;
import com.bank.transactions.Transaction;
import com.bank.transactions.TransactionHistory;
import java.util.List;

public abstract class BankAccount {

    private double balance;
    private AccountType accountType;
    private boolean accountStatus = true;
    private TransactionHistory transactionHistory = null;


    public BankAccount(double initialBalance, AccountType initialAccountType){
        this.balance = initialBalance;
        this.accountType = initialAccountType;
        transactionHistory = new TransactionHistory();
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public boolean getAccountStaus() {
        return accountStatus;
    }

    public void diposit(double amount) {
        if(amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }

    public  TransactionHistory getTransactionHistory(){
        return transactionHistory;
    }

    // متد انتزاعی برای محاسبه سود
    public abstract double calculateInterest();

    public void printAccountInfo(){
        System.out.println("Account Type : "+ accountType);
        System.out.println("Balance : " + balance);
        System.out.println("Status : " + (accountStatus? "Active" : "Closed"));
        System.out.println(transactionHistory.getTransactions());
    }



}

