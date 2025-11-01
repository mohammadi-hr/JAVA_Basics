package com.bank.accounts;
import com.bank.enums.AccountType;
import com.bank.accounts.BankAccount;

public class CheckingAccount extends BankAccount {

    private double interestRate = 0;

    public CheckingAccount(double initialBalance, String accountNumber){
        super(initialBalance, AccountType.CHECKING, accountNumber);
    }

    public double calculateInterest(){
        return getBalance() * interestRate; // حساب جاری معمولاً سود ندارد
    }
}
