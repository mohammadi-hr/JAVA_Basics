package com.bank.accounts;
import com.bank.enums.AccountType;

public abstract class BankAccount {

    protected double balance;
    protected AccountType accountType;
    protected boolean accountStatus = true;


    public BankAccount(double initialBalance, AccountType initialAccountType){
        this.balance = initialBalance;
        this.accountType = initialAccountType;
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

    // متد انتزاعی برای محاسبه سود
    public abstract double calculateInterest();

}

