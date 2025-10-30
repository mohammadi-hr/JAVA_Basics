package com.bank.accounts;
import com.bank.accounts.BankAccount;
import com.bank.enums.AccountType;

public class SavingsAccount extends BankAccount {

    private double accountInterestRate;

    public SavingsAccount(double initialBalance, double initailaInterestRate) {
        super(initialBalance, AccountType.SAVINGS);
        this.accountInterestRate = initailaInterestRate;
    }

    public double calculateInterest(){
        return balance * accountInterestRate;
    }
}
