package com.bank.accounts;
import com.bank.enums.AccountType;
import com.bank.accounts.BankAccount;

import java.util.Random;

public class CheckingAccount extends BankAccount {

    public final String CHECKING_ACCOUNT_IDENTIFIER = "6037";
    private double interestRate = 0;

    public CheckingAccount(double initialBalance){
        super(initialBalance, AccountType.CHECKING);
        setAccountNumber(accountNoGenerator());
    }

    public double calculateInterest(){
        return getBalance() * interestRate; // حساب جاری معمولاً سود ندارد
    }

    @Override
    protected String accountNoGenerator(){
        String charList = "0123456789";
        StringBuilder accNo = new StringBuilder();
        while (accNo.length() < 12){
            int index = (int) (Math.random() * 10) ;
            accNo.append(charList.charAt(index));
        }

        return CHECKING_ACCOUNT_IDENTIFIER + accNo.toString();
    }


    }

