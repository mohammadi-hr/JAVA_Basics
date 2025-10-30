package com.bank.accounts;
import com.bank.enums.AccountType;
import com.bank.accounts.BankAccount;

public class CheckingAccount extends BankAccount {

    private double interestRate = 0;

    public CheckingAccount(double initialBalance){
        super(initialBalance, AccountType.CHECKING);
    }

    public double calculateInterest(){
        return balance * interestRate; // حساب جاری معمولاً سود ندارد
    }
}
