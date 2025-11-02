package com.bank.accounts;
import com.bank.enums.AccountType;

import java.util.Random;
import java.util.function.Supplier;

public class SavingsAccount extends BankAccount {

    private final String SAVINGS_ACCOUNT_IDENTIFIER = "5022";
    private double accountInterestRate;

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    private boolean isPremium = false;

    public SavingsAccount(double initialBalance, double initailaInterestRate) {
        super(initialBalance, AccountType.SAVINGS);
        this.accountInterestRate = initailaInterestRate;
        setAccountNumber(accountNoGenerator());
    }

    public double calculateInterest(){
        return getBalance() * accountInterestRate;
    }

    @Override
    protected String accountNoGenerator(){
        Random rand = new Random();
        StringBuilder accNo = new StringBuilder();
        while (accNo.length() < 12){

            accNo.append(rand.nextInt(10));
        }

        String final_accNo = SAVINGS_ACCOUNT_IDENTIFIER + accNo.toString();

        Supplier<String> accNo_created_at_log = () -> final_accNo + " created at : " + System.currentTimeMillis();
        System.out.println(accNo_created_at_log.get());

        return final_accNo;
    }

}
