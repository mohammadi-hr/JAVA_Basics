package com.bank.app;
import com.bank.accounts.*;
import com.bank.filters.TransactionWithdrawPredicate;
import com.bank.filters.TransactionsFilter;
import com.bank.transactions.Transaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args){

        System.out.printf("Hello and welcome! To Learn JAVA Programming Language by Back Account System Examples");



//        System.out.println("Enter type of the account you wanna make : \n (1 : savineAccount and 2 : checkingAccount)");
//        Scanner scnObj = new Scanner(System.in);
//        int accountType = scnObj.nextInt();
//
//        if(accountType == 1) {
//            System.out.println("Enter the account balance : ");
//            double balance = scnObj.nextDouble();
//            System.out.println("Enter the account interest rate: ");
//            double interestRate = scnObj.nextDouble();
//            SavingsAccount s_v_1 = new SavingsAccount(balance, interestRate);
//            System.out.println("Your account annual interest rate would be : " + s_v_1.calculateInterest());
//        }
//
//        if(accountType == 2){
//            System.out.println("Your account annual interest rate would be : " + 0);
//        }


//-----------------------------------------------------------
//        print account by behavior parameterized methodology
//-----------------------------------------------------------

        List<BankAccount> bankAccounts = Arrays.asList(
                new SavingsAccount(10000, 14, "6037 1478 1478 1478"),
                new CheckingAccount(550000, "6037 1234 1234 1234"),
                new SavingsAccount(100, 23, "6039 5625 1421 4254 1245"),
                new SavingsAccount(1052, 24, "4514 1412 4125 6698")
        );

//        ----------------------------------------
//        use behavior parameterized
//        ----------------------------------------

        AccountPrinter.prettyPrintAccount(bankAccounts,new RichnessFormatter());

//        bankAccounts.sort(new Comparator<BankAccount>() {
//            @Override
//            public int compare(BankAccount o1, BankAccount o2) {
//                return Double.compare(o1.getBalance(), o2.getBalance());
//            }
//        });

//        ----------------------------------------
//        using Lambda to sort the List<BankAccount> bankAccounts
//        ----------------------------------------

        bankAccounts.sort((a1 , a2) -> Double.compare(a1.getBalance(), a2.getBalance()));

        AccountPrinter.prettyPrintAccount(bankAccounts,new SimpleBalanceFormatter());


        List<Transaction> transactions = Arrays.asList(
                new Transaction(1000, "withdraw"),
                new Transaction(10000, "deposit"),
                new Transaction(4000, "withdraw"),
                new Transaction(101400, "withdraw"),
                new Transaction(10020, "deposit"),
                new Transaction(34000, "deposit")
        );


        List<Transaction> filterd = TransactionsFilter.filter(transactions, new TransactionWithdrawPredicate());

        for(Transaction t : filterd) {
            System.out.println(t);
        }


//        -----------------------------------------------
//        Using Lambda for transactions in banking system by Runnable
//        -----------------------------------------------

        Runnable deposit_tank = new Runnable() {
            @Override
            public void run() {
                bankAccounts.get(0).diposit(5100);
            }
        };

        Runnable withdraw_task = () -> bankAccounts.get(1).withdraw(10500);

//        ---------------------------------------------
//        Create threads from runnable tanks
//        ---------------------------------------------

        Thread tw = new Thread(withdraw_task, "withdraw_thread");
        Thread td = new Thread(deposit_tank, "deposit_thread");

        tw.start();
        td.start();

        try{
            tw.join();
            td.join();
        }catch (InterruptedException e){
            e.fillInStackTrace();
        }

    }
}
