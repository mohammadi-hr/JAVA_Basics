package com.bank.accounts;

public class SimpleBalanceFormatter implements AccountFormatter{


    @Override
    public String format(BankAccount bankAccount) {
        return "Balance : " + bankAccount.getBalance();
    }
}
