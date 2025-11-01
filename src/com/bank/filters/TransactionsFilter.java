package com.bank.filters;

import com.bank.transactions.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionsFilter {

    private List<Transaction> filteredTransactions = new ArrayList<>();

    public TransactionsFilter(List<Transaction> transactions){

    }

//    --------------------not good software design-------------------------------
//    filter transactions by type <deposit | withdraw>
//    ---------------------------------------------------

    public List<Transaction> filterByTransactionType(List<Transaction> transactions, String transactionType){

        List<Transaction> result = new ArrayList<>();

        for(Transaction transaction : transactions){
            if(transaction.getType().equals(transactionType)){
                result.add(transaction);
            }
        }

        return result;
    }

//    ------------------not good software design-------------------
//    filter transactions by amount
//    -------------------------------------------------------------

    public List<Transaction> filterBytTransactionAmount(List<Transaction> transactions, long transactionAmount){
        List<Transaction> result = new ArrayList<>();

        for(Transaction transaction : transactions){
            if(transaction.getAmount() >= transactionAmount){
                result.add(transaction);
            }
        }

        return result;
    }


//    -------------------------------------------good design : parameterized strategy---------------------------------------------------------
//    using behavior """parameterized strategy""" in order to filter transactions based on different methodology
//    without changing the user interface fiter method
//    ----------------------------------------------------------------------------------------------------


    public static List<Transaction> filter(List<Transaction> transactions, TransactionWithdrawPredicate twp){
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions){
            if (twp.checkTransaction(t)){
                result.add(t);
            }
        }
        return result;
    }

}
