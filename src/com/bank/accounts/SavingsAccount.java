package com.bank.accounts;
import com.bank.enums.AccountType;

public class SavingsAccount extends BankAccount {

    private final String SAVINGS_ACCOUNT_IDENTIFIER = "5022";
    private double accountInterestRate;

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
        String charList = "0123456789";
        StringBuilder accNo = new StringBuilder();
        while (accNo.length() < 12){
            int index = (int) (Math.random() * 10) ;
            accNo.append(charList.charAt(index));
        }

        return SAVINGS_ACCOUNT_IDENTIFIER + accNo.toString();
    }

}
