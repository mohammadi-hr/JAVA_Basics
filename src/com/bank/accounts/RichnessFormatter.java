package com.bank.accounts;

public class RichnessFormatter implements AccountFormatter{

    @Override
    public String format(BankAccount bankAccount){
        return "Account Type : " + bankAccount.getAccountType() + ((bankAccount.getBalance() > 1000) ? "High Balance" : "Low Balance");
    }

}
