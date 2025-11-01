package com.bank.accounts;
import com.bank.accounts.BankAccount;
import com.bank.enums.AccountType;

public class SavingsAccount extends BankAccount {

    private double accountInterestRate;

    public SavingsAccount(double initialBalance, double initailaInterestRate, String accountNumber) {
        super(initialBalance, AccountType.SAVINGS, accountNumber);
        this.accountInterestRate = initailaInterestRate;
    }

    public double calculateInterest(){
        return getBalance() * accountInterestRate;
    }
}
