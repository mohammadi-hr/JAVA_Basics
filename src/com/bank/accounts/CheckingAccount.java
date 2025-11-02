package com.bank.accounts;
import com.bank.enums.AccountType;
import com.bank.accounts.BankAccount;

import java.util.Random;
import java.util.function.Supplier;

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

        Random rand = new Random();
        StringBuilder accNo = new StringBuilder();

        while (accNo.length() < 12){

            accNo.append(rand.nextInt(10));
        }

        String final_accNo = CHECKING_ACCOUNT_IDENTIFIER + accNo.toString();

        Supplier<String> accNo_created_at_log = () -> final_accNo + " created at : " + System.currentTimeMillis();
        System.out.println(accNo_created_at_log.get());

        return final_accNo;
    }


    }

